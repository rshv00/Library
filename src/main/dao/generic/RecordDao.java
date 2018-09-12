package main.dao.generic;

import main.entity.Record;
import main.entity.User;
import org.apache.commons.lang3.ObjectUtils;

import java.util.List;
import java.util.Map;

public interface RecordDao extends GenericDao<Record, Long, ObjectUtils.Null>{

    /**
     * @return map with key Record, value DaysOnHands with records that are on hands by userId
     */
    Map<Record, Integer> getActiveRecords(Long userId);

    /*
     * All records that are on hands
     * */
    List<Record> getActiveRecords();

    /*
     * All completed records by userId
     * */
    List<Record> getHistoryOfRecords(Long userId);

    /**
     * @param periodDays number of days when user counts as a debtor
     * @return list of debtors
     */
    List<User> getDebtors(int periodDays);

    int getAvgAgeOfReaders(long authorId);

}
