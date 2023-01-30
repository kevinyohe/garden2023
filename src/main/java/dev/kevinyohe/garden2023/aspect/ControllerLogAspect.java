package dev.kevinyohe.garden2023.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class ControllerLogAspect {

    @Pointcut("within(dev.kevinyohe.garden2023.controller..*)")
    public void controllerPointcut(){

    }

    @Around("controllerPointcut()")
    public void logIt() {
        log.info("Controller was ran!");
    }
}
