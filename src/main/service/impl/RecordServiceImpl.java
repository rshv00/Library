package main.service.impl;

import main.dao.impl.RecordDaoImpl;
import main.entity.Record;
import main.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RecordServiceImpl implements RecordService {

    @Autowired
    RecordDaoImpl dao;

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
        return dao.getActiveRecords(userId);
    }

    @Override
    public List<Record> getHistoryOfRecords(Long userId) {
        return dao.getHistoryOfRecords(userId);
    }
}
