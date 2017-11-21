package com.andyr.impatient9.ch1;

import java.util.Scanner;

public class C1E16 {
    public static void main(String[] args) {
        System.out.println(average(3.3,4.4,5.5,6.6,7.7));
        System.out.println(average(3.3));
    }

    static double average(double first, double... rest){
        double sum = first;
        for(double v: rest){
            sum += v;
        }
        return sum / (1 + rest.length);
    }
}

