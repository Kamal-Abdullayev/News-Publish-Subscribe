package com.newspubsub.news.controller;

import com.newspubsub.news.service.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/producer")
public class ProducerController {
    private final Producer producer;
    @GetMapping
    public ResponseEntity<HttpStatus> sendMessages() {
        producer.sendMessage();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
