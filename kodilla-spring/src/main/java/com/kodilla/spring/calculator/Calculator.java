package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private double val;

    @Autowired
    private Display display;

    public double add(double a, double b) {
        val = a + b;
        display.displayValue(val);
        return val;
    }
    public double sub(double a, double b) {
        val = a - b;
        display.displayValue(val);
        return val;
    }

    public double mul(double a, double b) {
        val = a * b;
        display.displayValue(val);
        return val;
    }

    public double div(double a, double b) {
        val = a / b;
        display.displayValue(val);
        return val;
    }
}