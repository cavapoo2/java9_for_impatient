package com.andyr.impatient9.ch1;

import java.math.BigInteger;
import java.util.Scanner;

public class C1E6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            BigInteger res = factorial(BigInteger.valueOf(in.nextInt()));
            System.out.println(res.toString());
        }

    }
    //not so sure recursion is bad idea, maybe loop better!
    static BigInteger factorial(BigInteger in) {
        if (in.equals(BigInteger.valueOf(0))) return BigInteger.valueOf(1);
        else{
            return in.multiply(factorial(in.subtract(BigInteger.valueOf(1))));
        }
    }
}
