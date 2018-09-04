package com.edu.library.dao;


import com.edu.library.entity.Record;

public class RecordDao extends GenericDaoImpl<Record> {

    public RecordDao(Class<Record> elementClass) {
        super(elementClass);
    }
}
