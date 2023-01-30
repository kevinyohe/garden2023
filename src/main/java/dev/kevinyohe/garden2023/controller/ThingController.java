package dev.kevinyohe.garden2023.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/thing")
public class ThingController {

    // create get mapping for thing
    @GetMapping
    public String getThing() {
        log.info("This is a thing");
        return "This is a thing";
    }

    // create post mapping for thing
    @PostMapping
    public String postThing(@RequestBody String thing) {
        return thing + " > This is a thing";
    }

    // create delete mapping for thing
    @DeleteMapping
    public String deleteThing() {
        return "This is a thing > deleted";
    }

}
