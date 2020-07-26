package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathActionController {

    @GetMapping("/sum")
    public String sum(@RequestParam int number1, @RequestParam int number2, @RequestParam int number3) {
        return String.valueOf(number1 + number2 + number3);
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam int number1, @RequestParam int number2) {
        return String.valueOf(number1 - number2);
    }

    @GetMapping("/multiply/{number1}/{number2}")
    public String multiply(@PathVariable int number1, @PathVariable int number2) {
        return String.valueOf(number1 * number2);
    }

    @GetMapping("/divide/{number1}/{number2}")
    public String divide(@PathVariable int number1, @PathVariable int number2) {
        return String.valueOf(number1 / number2);
    }


}
