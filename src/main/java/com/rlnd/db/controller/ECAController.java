package com.rlnd.db.controller;

import com.rlnd.db.model.DefaultResponse;
import com.rlnd.db.model.request.RequestModel;
import com.rlnd.db.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/eca")
public class ECAController {

    @Autowired
    OrderService orderService;

    @CrossOrigin
    @PostMapping(value = "/create-entry", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DefaultResponse> createEmergencyEntry(@RequestBody RequestModel requestModel) {
        DefaultResponse response = orderService.save(requestModel);
        return ResponseEntity.status(response.getCode()).body(response);
    }

    @CrossOrigin
    @GetMapping(value = "/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DefaultResponse> getAll() {
        return ResponseEntity.status(200).body(orderService.get());
    }

    @CrossOrigin
    @DeleteMapping(value = "/delete-entry/{id}")
    public ResponseEntity<DefaultResponse> deleteEmergencyEntry(@PathVariable String id) {
        return ResponseEntity.status(200).body(orderService.delete(id));
    }
    
}