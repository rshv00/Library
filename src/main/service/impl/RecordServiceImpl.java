package main.service.impl;

import main.dao.generic.BookInstanceDao;
import main.dao.generic.RecordDao;
import main.dao.generic.UserDao;
import main.entity.BookInstance;
import main.entity.Record;
import main.entity.User;
import main.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    RecordDao dao;
    @Autowired
    UserDao userDao;
    @Autowired
    BookInstanceDao bookInstanceDao;

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
    public Map<Record, Integer> getActiveRecords(Long userId) {
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

    @Override
    public void takeBook(long userId, long instanceId) {
        LocalDate dateTaken = LocalDate.now();
        User user = userDao.getElementById(userId);
        BookInstance bookInstance = bookInstanceDao.getElementById(instanceId);
        bookInstance.setAvailable(false);
        Record record = new Record();
        bookInstanceDao.updateElement(bookInstance);
        record.setInstance(bookInstance);
        record.setTaken(dateTaken);
        record.setUser(user);
        updateRecord(record);
    }

    @Override
    public void returnBook(long userId, long instanceId, long recordId) {
        LocalDate dateReturned = LocalDate.now();
        BookInstance bookInstance = bookInstanceDao.getElementById(instanceId);
        bookInstance.setAvailable(false);
        bookInstanceDao.updateElement(bookInstance);
        Record record = getRecordById(recordId);
        record.setReturned(dateReturned);
        updateRecord(record);
    }
}
