package tads.ifms.msworker.controller;

import tds.ifms.msworker.model.Worker;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/worker")
public class workerController {

    @GetMapping
    public ResponseEntity<Worker> getWorker(){
        Worker worker = new Worker("Ze das Couves", 100.00);
        return ResponseEntity.ok(worker);
    }
    
}
