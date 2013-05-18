package com.sentientmonkey.fizzbuzz;

import com.sentientmonkey.fizzbuzz.service.FizzBuzzService;

public class Runner {

    public static void main(String[] args) {
        FizzBuzzService fizzBuzz = new FizzBuzzService();
        fizzBuzz.print(1, 100);
    }

}
