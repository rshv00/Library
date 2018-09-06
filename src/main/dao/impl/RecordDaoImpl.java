package main.dao.impl;


import main.dao.generic.RecordDao;
import main.entity.Record;

import java.util.List;

public class RecordDaoImpl extends GenericDaoImpl<Record, Long>
        implements RecordDao {

    public RecordDaoImpl(Class<Record> elementClass) {
        super(elementClass);
    }

    @Override
    public List<Record> getActiveRecords(Long userId) {
        return ;
    }

    @Override
    public List<Record> getHistoryOfRecords(Long userId) {
        return ;
    }
}
