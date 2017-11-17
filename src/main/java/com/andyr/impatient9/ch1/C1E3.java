package com.andyr.impatient9.ch1;

import java.util.Scanner;

public class C1E3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] vals = new int[3];
        int count=0;
        while(in.hasNext())
        {
            vals[count] = in.nextInt();
            if (count == 2) {
                getMax(vals);
                count=0;
            } else {
                count++;
            }

        }
    }
    static void getMax(int[] in) {
       int max = (in[0] > in[1]) ? ((in[0] > in[2]) ? in[0] : in[2]) : (in[1] > in[2] ? in[1] : in[2]); //not pretty
        int max2 = Math.max(in[0],Math.max(in[1],in[2]));
        System.out.printf("Max is %d and %d\n", max, max2);
    }
}
