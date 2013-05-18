package com.sentientmonkey.fizzbuzz.rules;

public class FizzRule extends Rule {

    @Override
    public void append(int number) {
        if ((number % 3) == 0) {
            builder.append("Fizz");
        }
    }

}
