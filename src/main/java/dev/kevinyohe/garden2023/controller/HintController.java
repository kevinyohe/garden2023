package dev.kevinyohe.garden2023.controller;


import dev.kevinyohe.garden2023.model.Hint;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class HintController {
    @Value("${key.something}")
    private String injectedProperty;

    @GetMapping("/api/hint")
    public Hint getHint() {
        log.info("returning a hint");
        System.out.println("log = " + log);
        return new Hint("Dont wizz on the electric fence");
    }

    @GetMapping("/api/hint2")
    public Hint getHint2() {
        // wait 30 secs
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Hint("Pizza boxes are a good source of cheese");
    }

    @GetMapping("/api/info")
    public String getInfo() {
        // return configuration info
        // sleep for 3 secs
        
        return "injectedProperty = " + injectedProperty;
    }
}
