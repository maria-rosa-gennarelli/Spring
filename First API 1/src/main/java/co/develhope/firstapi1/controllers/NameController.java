package co.develhope.firstapi1.controllers;
import org.springframework.web.bind.annotation.*;


@RestController
class NameController{


    @GetMapping(value = "/name/{name}")
    public String getName(@PathVariable String name){
        return name;
    }

    @PostMapping(value = "/name/{name}")
    public String postName (@PathVariable String name){
        StringBuilder reversed = new StringBuilder();
        reversed.append(name);
        reversed.reverse();
        return reversed.toString();
    }

}