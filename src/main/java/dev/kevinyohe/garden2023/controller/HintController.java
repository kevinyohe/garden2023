package dev.kevinyohe.garden2023.controller;


import dev.kevinyohe.garden2023.model.Hint;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class HintController {
    @GetMapping("/api/hint")
    public Hint getHint() {
        log.info("returning a hint");
        System.out.println("log = " + log);
        return new Hint("Dont wizz on the electric fence");
    }
}
