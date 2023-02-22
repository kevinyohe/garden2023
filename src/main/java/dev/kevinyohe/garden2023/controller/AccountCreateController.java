package dev.kevinyohe.garden2023.controller;

import dev.kevinyohe.garden2023.event.CreateEvent;
import dev.kevinyohe.garden2023.publisher.EventPublisher;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class AccountCreateController {

    @Autowired
    private EventPublisher eventPublisher;

    @PostMapping("/api/account/create")
    public ResponseEntity<Void> createAccount() {
        log.info("creating account");
        CreateEvent event = new CreateEvent("account created");
        eventPublisher.publishEvent(event);

        return ResponseEntity.accepted().build();
    }
}
