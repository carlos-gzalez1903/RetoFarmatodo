package com.retofarmatodo.web.controller;

import com.retofarmatodo.persistence.entity.Numbers3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/numHappy")
public class Punto3Controller {

    private List<Numbers3> numbers = new ArrayList();
    @GetMapping("{stringNumber}")
    public Map getNumHappy(@PathVariable("stringNumber") String stringNumber){
        System.out.println("Cadena: "+ stringNumber);
        String[] listNumbers = stringNumber.split(",");
        List<Numbers3> numbers3s= new ArrayList<>();
        Map<String, List<Numbers3>> mapNumbers = new HashMap<>();

        for (int i = 0; i < listNumbers.length; i++) {
            if (isHappy(Integer.parseInt(listNumbers[i]))) {
                Numbers3 num = new Numbers3(Integer.parseInt(listNumbers[i]), true);
                numbers3s.add(num);
            } else {
                Numbers3 num = new Numbers3(Integer.parseInt(listNumbers[i]), false);
                numbers3s.add(num);
            }
        }
        mapNumbers.put("numbers",numbers3s);
        return  mapNumbers;

    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(!set.contains(n)){
            set.add(n);
            n = getSum(n);
            if(n==1)
                return true;
        }
        return false;
    }
    public int getSum(int n){
        int sum = 0;
        while(n>0){
            sum+=(n%10)*(n%10);
            n=n/10;
        }
        return sum;
    }

}
