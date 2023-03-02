package co.develhope.firstapi2.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FactorialController{

    @GetMapping(value = "/factorial/{n}")
    public int factorial(@PathVariable Integer n){
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }



}