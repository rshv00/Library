package main.service;

import main.entity.Record;

import java.util.List;

public interface RecordService {

    public void addRecord(Record record);

    public void deleteRecord(Record record);

    public List<Record> listRecords();

    public Record getRecordById(Long id);

    public void updateRecord(Record record);

}
