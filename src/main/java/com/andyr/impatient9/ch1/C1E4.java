package com.andyr.impatient9.ch1;
import java.util.Scanner;
import com.andyr.impatient9.Util;

public class C1E4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            double[] vals  = Util.convert(Util.getArgs(in));
            System.out.printf("Max is %f, Min is %f\n", largest(vals),smallest(vals));

        }
    }
    static double smallest(double[] in) {
        double res = in.length > 0 ? Math.nextUp(in[0]) : Double.MIN_VALUE;
        for(int i = 1; i < in.length; i++)
        {
            if (Math.nextUp(in[i]) < res) res = Math.nextUp(in[i]);
        }
        return res;
    }
     static double largest (double[] in) {
        double res = in.length > 0 ? Math.nextUp(in[0]) : Double.MAX_VALUE;
        for(int i = 1; i < in.length; i++)
        {
            if (Math.nextUp(in[i]) > res) res = Math.nextUp(in[i]);
        }
        return res;
    }
}
