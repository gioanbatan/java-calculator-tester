package org.example;

public class Calculator {
    float num1;
    float num2;

    public static float floatAdd(float num1, float num2) {
        return num1 + num2;
    }

    public static float floatSubstract(float num1, float num2) {
        return num1 - num2;
    }

    public static float floatDivide(float num1, float num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by 0");
        }
        return num1 / num2;
    }
    public static float floatMultiply(float num1, float num2) {
        return num1 * num2;
    }
}
