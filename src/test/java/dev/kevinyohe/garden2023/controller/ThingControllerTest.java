package dev.kevinyohe.garden2023.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ThingControllerTest {

    @Autowired
    ThingController thingController;

    @Test
    void getThing() {
        var thing = thingController.getThing();
        assertEquals("This is a thing", thing);
    }

    @Test
    void postThing() {
        var thing = thingController.postThing("This is a thing");
        assertEquals("This is a thing > This is a thing", thing);
    }

    @Test
    void deleteThing() {
        var thing = thingController.deleteThing();
        assertEquals("This is a thing > deleted", thing);
    }
}