package com.percentage;

import com.division.Division;
import com.multiplication.Multiplication;

public class Percentage {

    public Double calculatePercentage(Integer a, Integer b) {

        Multiplication mul = new Multiplication();
        Division div = new Division();
        return div.divide(mul.multiply(a,100),b);
    }
}
