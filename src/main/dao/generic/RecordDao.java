package main.dao.generic;

import main.entity.Record;

import java.util.List;

public interface RecordDao extends GenericDao<Record, Long> {

    /*
    * All records that are on hands by userId
    * */
    List<Record> getActiveRecords(Long userId);

    /*
    * All completed records by userId
    * */
    List<Record> getHistoryOfRecords(Long userId);



}
