package main.dao.impl;


import main.entity.Record;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class RecordDao extends GenericDaoImpl<Record, Long> {

    public RecordDao() {
        super(Record.class);
    }
}
