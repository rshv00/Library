package main.service.impl;

import main.dao.generic.RecordDao;
import main.entity.Record;
import main.entity.User;
import main.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {

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
        return dao.getActiveRecords(userId);
    }

    @Override
    public List<Record> getActiveRecords() {
        return dao.getActiveRecords();
    }

    @Override
    public List<Record> getHistoryOfRecords(Long userId) {
        return dao.getHistoryOfRecords(userId);
    }

    @Override
    public List<User> getDebtors(int periodDays) {
        return dao.getDebtors(periodDays);
    }
}
