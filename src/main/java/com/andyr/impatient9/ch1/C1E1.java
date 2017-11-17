package com.andyr.impatient9.ch1;

import java.util.Scanner;

public class C1E1 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        while(in.hasNext()) //type in CTRL-D to get out of this loop or CTRL-C
        {
            int value = in.nextInt();
            System.out.printf("b%s , O%o, 0x%x\n",Integer.toBinaryString(value),value,value);
            if (value != 0)
                System.out.printf("Reciprocal = %a\n",1.0/(double)value);
        }
    }
}
