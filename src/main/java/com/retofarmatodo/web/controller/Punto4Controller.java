package com.retofarmatodo.web.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/SumNum")
public class Punto4Controller {

    @GetMapping("{num}")
    public Map getResult(@PathVariable("num") int num){
        Map<String, Integer> number = new HashMap<>();
        number.put("result", calculateResult(num));
        //System.out.println("myInteger es de tipo " +  ((Object)myInteger).getClass().getSimpleName());
        return number;
    }

    public int calculateResult(int number){
        int result = (number*(number+1))/2;
        return result;
    }



}
