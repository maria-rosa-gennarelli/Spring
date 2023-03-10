package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("Maccio")
    private String devName;

    @Value("xyz458")
    private String authCode;

    @GetMapping
    public String getDevName(){
        return "devName: " + devName + " and authCode is: " + authCode;
    }
}
