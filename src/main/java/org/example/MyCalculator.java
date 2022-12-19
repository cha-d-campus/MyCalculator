package org.example;

import static java.lang.String.valueOf;

public class MyCalculator {
    public String Addition(int n1, int n2){
        int result = n1 + n2;
        return  Integer.toString(result);
    }

    public String Substraction(int n1, int n2){
        int result = n1 - n2;
        return  Integer.toString(result);
    }

    public String Multiplication(int n1, int n2){
        int result = n1 * n2;
        return  Integer.toString(result);
    }

    public String Division(int n1, int n2){
        try {
            int result = n1 / n2;
            return Integer.toString(result);
        } catch (ArithmeticException e){
            return "Cannot divide by 0";
        }
    }
}
