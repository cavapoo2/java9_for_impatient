package com.andyr.impatient9.ch5;

import com.andyr.impatient9.ch3.C3E16;

public class C5E13 {
    public static void main(String[] args) {
        int[] vals = {4,3,7,2,9,10,22,1,-3,-100,44,22};
        System.out.println("min is " + getMin(vals));

    }
    public static int getMin(int[] vals) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i < vals.length; i++) {
            if (vals[i] < min) min = vals[i];
        }
        //min = 1;
        //System.out.println(checkMin(vals,min));
        assert checkMin(vals,min) == min; //remeber to run like java -cp classpath -ea class
        return min;
    }

    private static int checkMin(int[] values, int min) {
        for(int i=0; i < values.length; i++) {
            if(values[i] < min) return values[i];
        }
        return min;
    }
}
