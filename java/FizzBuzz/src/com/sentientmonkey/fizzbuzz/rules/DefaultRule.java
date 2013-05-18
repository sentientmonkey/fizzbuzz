package com.sentientmonkey.fizzbuzz.rules;

public class DefaultRule extends Rule {

    @Override
    public void append(int number) {
        if (builder.length() == 0) {
            builder.append(number);
        }
    }

}
