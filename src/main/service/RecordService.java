package main.service;

import main.entity.Record;
import main.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecordService {

    public void addRecord(Record record);

    public void deleteRecord(Record record);

    public List<Record> listRecords();

    public Record getRecordById(Long id);

    public void updateRecord(Record record);

    /*
     * All records that are on hands by userId
     * */
    List<Record> getActiveRecords(Long userId);

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


}
