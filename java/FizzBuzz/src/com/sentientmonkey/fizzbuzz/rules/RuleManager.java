package com.sentientmonkey.fizzbuzz.rules;

import java.util.ArrayList;

public class RuleManager {

    ArrayList<Rule> rules;

    public RuleManager() {
        rules = new ArrayList<Rule>();
    }

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public String evaluateRules(int number) {
        StringBuilder builder = new StringBuilder();
        for (Rule rule : rules) {
            rule.withBuilder(builder).append(number);
        }
        return builder.toString();
    }

}
