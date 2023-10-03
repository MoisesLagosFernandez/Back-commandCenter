package cl.ti.BackcommandCenter.controller;

import cl.ti.BackcommandCenter.model.RecordType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import cl.ti.BackcommandCenter.service.RecordTypeService;

import java.util.List;

@RestController
@RequestMapping("/api/record-types")
public class RecordTypeController {
    @Autowired
    private RecordTypeService recordTypeService;

    @PostMapping
    public ResponseEntity<RecordType> createRecordType(@RequestBody RecordType recordType) {
        RecordType createdRecordType = recordTypeService.saveRecordType(recordType);
        return ResponseEntity.ok(createdRecordType);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecordType> getRecordTypeById(@PathVariable Long id) {
        RecordType recordType = recordTypeService.getRecordTypeById(id);
        if (recordType == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recordType);
    }

    @GetMapping
    public ResponseEntity<List<RecordType>> getAllRecordTypes() {
        List<RecordType> recordTypes = recordTypeService.getAllRecordTypes();
        return ResponseEntity.ok(recordTypes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecordType(@PathVariable Long id) {
        recordTypeService.deleteRecordType(id);
        return ResponseEntity.noContent().build();
    }
}
