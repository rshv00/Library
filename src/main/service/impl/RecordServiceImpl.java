package main.service.impl;

import main.dao.impl.RecordDao;
import main.entity.Record;
import main.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public abstract class RecordServiceImpl implements RecordService {

    @Autowired
    RecordDao dao;

    @Override
    public void addRecord(Record record) {
        dao.addElement(record);
    }

    @Override
    public void deleteRecord(Record record) {
        dao.deleteElement(record);
    }

    @Override
    public List<Record> listRecords() {
        return dao.getAllElements();
    }

    @Override
    public Record getRecordById(Long id) {
        return dao.getElementById(id);
    }

    @Override
    public void updateRecord(Record record) {
        dao.updateElement(record);
    }

    @Override
    public List<Record> getActiveRecords(Long userId) {
        List<Record> allRecords = dao.getAllElements();
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
        List<Record> allRecords = dao.getAllElements();
        List<Record> unactiveRecords = new ArrayList<>();

        for (Record record : allRecords) {
            if (record.getReturned() != null) {
                unactiveRecords.add(record);
            }
        }
        return unactiveRecords;
    }
}
