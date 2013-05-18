package com.sentientmonkey.fizzbuzz.rules;

public class BuzzRule extends Rule {

    @Override
    public void append(int number) {
        if ((number % 5) == 0) {
            builder.append("Buzz");
        }
    }
}
