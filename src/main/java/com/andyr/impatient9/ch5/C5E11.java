package com.andyr.impatient9.ch5;

import java.math.BigInteger;

public class C5E11 {
    public static void main(String[] args) {
        System.out.println(C5E11.factorial(BigInteger.valueOf(10)));

    }
    public static BigInteger factorial(BigInteger in) {

        if(in.equals(BigInteger.valueOf(1))){
            return BigInteger.valueOf(1);
        }
        else {
            StackWalker walker = StackWalker.getInstance();
            walker.forEach(frame -> System.out.println("Class=" + frame.getClassName() + ",bi=" +  frame.getByteCodeIndex() + ",line num= " + frame.getLineNumber()
            ));
            return  in.multiply(factorial(in.subtract(BigInteger.valueOf(1))));
        }
    }
}

