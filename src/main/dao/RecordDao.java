package main.dao;


import main.entity.Record;

public class RecordDao extends GenericDaoImpl<Record> {

    public RecordDao(Class<Record> elementClass) {
        super(elementClass);
    }
}
