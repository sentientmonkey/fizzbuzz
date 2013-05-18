package com.sentientmonkey.fizzbuzz.service;

import com.sentientmonkey.fizzbuzz.rules.*;

public class FizzBuzzService {
    RuleManager ruleManager;

    public FizzBuzzService() {
        ruleManager = new RuleManager();
        ruleManager.addRule(new FizzRule());
        ruleManager.addRule(new BuzzRule());
        ruleManager.addRule(new DefaultRule());
    }

    public void print(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(ruleManager.evaluateRules(i));
        }
    }

}
