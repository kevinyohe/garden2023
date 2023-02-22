package dev.kevinyohe.garden2023.event;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

@Log4j2
public class CreateEvent extends ApplicationEvent {
    public CreateEvent(String message) {
        super(message);
    }

    @EventListener
    public void handleEvent(CreateEvent event) {
        log.info("event = " + event);
    }
}
