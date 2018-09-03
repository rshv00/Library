package dao;

import entity.Record;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RecordDao extends GenericDaoImpl<Record> {

    public RecordDao(Class<Record> elementClass) {
        super(elementClass);
    }
}
