package com.andyr.impatient9.ch1;
import com.andyr.impatient9.Util;

import java.util.Scanner;

public class C1E7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            long[] vals = Util.convert2Longs(Util.getArgs(in));
            if (vals.length != 2) continue;
            else {
                long a = vals[0]; long b = vals[1];
                System.out.printf("Sum=%d, Diff=%d, Prod=%d, Quo=%d, Rem=%d\n",sum(a,b),diff(a,b),prod(a,b),quotient(a,b),rem(a,b));
            }

        }
    }
    static long sum(long a,long b) {
        return a + b;
    }
    static long diff(long a, long b) {
        return a - b;
    }
    static long prod(long a, long b) {
        return a * b;
    }
    static long quotient(long a , long b){ return a / b; };
    static long rem(long a, long b) { return a % b;}

}
