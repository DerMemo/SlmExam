package com.example.SlmExam.feature1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/factorial")
public class FactorialService {

    @Autowired

    @GetMapping("/number")
    public int calculatefactorial(@RequestParam int number) {

        int factorialSum = 0;
        int factorial = 1;
        for (int i = 1; i <= number; i++)
            factorial = factorial * i;

        factorialSum += factorial;
        return factorialSum;
    }
    @GetMapping("/number2")
    public int calculateTotal(@RequestParam int number) {
        int zwSum = getFactorialsum();
        zwSum += getFactorialsum();

    }
public static int getFactorialsum(){
        return getFactorialsum();
}

}
