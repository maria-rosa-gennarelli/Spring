package co.develhope.swagger.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
@Api(tags = {"name-controller"})
    public class NameController {

        @GetMapping
        @ApiOperation(value = "Get the user's name", notes = "Returns the user's name as a string")
        public String getName() {
            return "Pino Pippo";
        }

}