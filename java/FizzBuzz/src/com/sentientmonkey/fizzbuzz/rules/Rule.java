package com.sentientmonkey.fizzbuzz.rules;

public abstract class Rule {
    StringBuilder builder = null;

    public Rule withBuilder(StringBuilder builder) {
        this.builder = builder;
        return this;
    }

    public abstract void append(int number);
}
