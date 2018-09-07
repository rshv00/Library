package main.service;

import main.entity.Record;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
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
     * All completed records by userId
     * */
    List<Record> getHistoryOfRecords(Long userId);
}
