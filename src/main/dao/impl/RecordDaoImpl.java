package main.dao.impl;


import main.dao.generic.RecordDao;
import main.entity.Record;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class RecordDaoImpl extends GenericDaoImpl<Record, Long> implements RecordDao {

    public RecordDaoImpl() {
        super(Record.class);
    }

    @Override
    public List<Record> getActiveRecords(Long userId) {
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
}
