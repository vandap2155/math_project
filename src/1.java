package com.math_project;

public class MathClass {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int difference(int num1, int num2) {
        return num1 - num2;
    }

    public static double average(double[] numbers) {
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}