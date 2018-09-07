package main.dao.impl;


import main.dao.generic.RecordDao;
import main.entity.Record;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Repository
public class RecordDaoImpl extends GenericDaoImpl<Record, Long>
        implements RecordDao {

    public RecordDaoImpl() {
        super(Record.class);
    }

    @Override
    public List<Record> getActiveRecords(Long userId) {
        
        return null;
    }

    @Override
    public List<Record> getHistoryOfRecords(Long userId) {
        return null;
    }
}
