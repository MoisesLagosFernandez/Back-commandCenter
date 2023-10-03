package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.model.Record;
import java.util.List;

public interface RecordService {
    Record saveRecord(Record record);
    Record getRecordById(Long id);
    List<Record> getAllRecords();
    void deleteRecord(Long id);
}
