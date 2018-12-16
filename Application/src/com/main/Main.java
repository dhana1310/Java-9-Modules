package com.main;

import com.addition.Addition;
import com.division.Division;
import com.multiplication.Multiplication;
import com.percentage.Percentage;
import com.subtraction.Subtraction;

public class Main {

    public static void main(String[] args) {

        Integer a = 5, b = 10;

        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();
        Percentage per = new Percentage();

        System.out.println("Addition = " + add.add(a, b));
        System.out.println("Subtraction = " + sub.subtract(a, b));
        System.out.println("Multiplication = " + mul.multiply(a, b));
        System.out.println("Division = " + div.divide(a, b));
        System.out.println("Percentage = " + per.calculatePercentage(a, b) + "%");

    }
}
