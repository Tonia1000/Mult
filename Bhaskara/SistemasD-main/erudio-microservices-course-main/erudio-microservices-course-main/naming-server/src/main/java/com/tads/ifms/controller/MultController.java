package com.tads.ifms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/mult")
public class MultController {

    @GetMapping (value = "/{x}/{y}")
    public int getMult(@PathVariable int x, @PathVariable int y){
        return x*y;

    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public int mult(@RequestBody Bhaskara bhaskara){
        int result;
        result = (bhaskara.getX() + bhaskara.getY());
        return result;
    }
    
}