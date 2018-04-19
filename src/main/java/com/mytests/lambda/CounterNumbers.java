package com.mytests.lambda;

public class CounterNumbers {
    public double process(double a, double b, Counting counting) {
        double result = counting.count(a, b);
        System.out.println("Wynik działania --> " + result);
        return result;
    }
}
