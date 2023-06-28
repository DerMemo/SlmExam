package com.example.SlmExam.feature1;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/factorial")
public class FactorialService {

    @GetMapping("/number")
    public int calculatefactorial(@RequestParam int number) {

        int factorialSum = 0;
        int factorial = 1;
        for (int i = 1; i <= number; i++)
            factorial = factorial * i;

        factorialSum += factorial;
        return factorialSum;

    }
}