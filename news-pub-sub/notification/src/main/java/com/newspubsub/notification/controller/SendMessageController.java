package com.newspubsub.notification.controller;

import com.newspubsub.notification.dto.SendMailRequest;
import com.newspubsub.notification.service.SendMessageService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/message")
public class SendMessageController {
    private final SendMessageService sendMessageService;

    @PostMapping("/send")
    public ResponseEntity<HttpHeaders> send(@Valid @RequestBody SendMailRequest sendMailRequestDto) {
        sendMessageService.sendMail(sendMailRequestDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
