package com.andyr.impatient9.ch1;

import java.util.ArrayList;
import java.util.Random;

public class C1E10 {
    public static final String base36 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        C1E10.convert(-562058309L,16);
        C1E10.convert(-562058309L,36);
        System.out.println(Long.toString(-562058309,16));//easier way
        System.out.println(Long.toString(-562058309,36));

        Random r = new Random(System.currentTimeMillis());
        int val = r.nextInt();
        long val2 = r.nextLong();
        C1E10.convert(-val,16);
        C1E10.convert(val2,36);
    }

    public static void convert(long val, long radix) {
        ArrayList<String> res = new ArrayList<>();
        boolean sign = val < 0;
        if (!sign) {
            val = -val;
        }
        while(val <= -radix) {
            res.add(String.valueOf(base36.charAt(-(int)(val % radix))));
            val = val / radix;
        }
        res.add(String.valueOf(base36.charAt(-(int)val)));

        String[] resa = res.toArray(new String[0]);
        if (sign) System.out.printf("-");
        for(int i=resa.length-1; i >= 0 ; i--) {
            System.out.printf("%s",resa[i]);
        }
        System.out.println("");
    }
}
