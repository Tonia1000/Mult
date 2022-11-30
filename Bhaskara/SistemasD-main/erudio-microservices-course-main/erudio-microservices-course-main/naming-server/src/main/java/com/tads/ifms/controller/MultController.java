package com.tads.ifms.controller;

@RestController
@RequestMapping(value = "/mult")
public class MultController {

    @GettMapping (value = "/{x}/{y}")
    public int GetMult(@PathVariable int x, @PathVariable int y){
        return x*y;

    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public int soma(@RequestBody Bhaskara bhaskara){
        int result;
        result = (bhaskara.getX() + bhaskara.getY());
        return result;
    }
    
}