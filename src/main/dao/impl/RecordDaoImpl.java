package main.dao.impl;


import main.dao.generic.RecordDao;
import main.entity.Record;
import main.entity.User;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class RecordDaoImpl extends GenericDaoImpl<Record, Long, ObjectUtils.Null>
        implements RecordDao {

    public RecordDaoImpl() {
        super(Record.class);
    }

    @Override
    public List<Record> getActiveRecords(Long userId) {
        List<Record> allRecords = getAllElements();


        return null;
    }

    @Override
    public List<Record> getActiveRecords() {
        List<Record> allRecords = getAllElements();
        List<Record> activeRecords = new ArrayList<>();

        for (Record record : allRecords) {
            if (record.getReturned() == null) {
                activeRecords.add(record);
            }
        }
        return activeRecords;

    }

    @Override
    public List<Record> getHistoryOfRecords(Long userId) {
        List<Record> allRecords = getAllElements();
        List<Record> unactiveRecords = new ArrayList<>();

        for (Record record : allRecords) {
            if (record.getReturned() != null) {
                unactiveRecords.add(record);
            }
        }
        return unactiveRecords;

    }

    @Override
    public List<User> getDebtors(int period) {
        LocalDate now = LocalDate.now();

        List<Record> activeRecords = getAllElements("returned", null);

        if (activeRecords == null) {
            return null;
        }
        List<Record> debtRecords = null;

        for (Record record : activeRecords) {
            LocalDate taken = record.getTaken();
            long between = Math.abs(ChronoUnit.DAYS.between(now, taken));
            if (between > period) {
                debtRecords.add(record);
            }
        }

        if (debtRecords == null) {
            return null;
        }

        List<User> debtors = null;

        for (int j = 0; j < debtRecords.size(); j++) {
            User user = debtRecords.get(j).getUser();
            debtors.add(user);
        }

        if (debtors == null) {
            return null;
        }

        return debtors;
    }
}
