package co.develhope.interceptorsmiddleware1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class BasicController {

    @GetMapping ("/time")
    public String getTime() {
        return "Current Date/Time: " + LocalDateTime.now().toString();
    }
}