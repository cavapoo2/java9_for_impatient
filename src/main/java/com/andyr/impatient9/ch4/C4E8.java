package com.andyr.impatient9.ch4;
import com.andyr.impatient9.ch4.Test;
public class C4E8 {

    public static void main(String[] args) throws ClassNotFoundException{
        Class<?> cl = java.util.Scanner.class;
        System.out.println(cl.getName());
        Class<?> sa = String[].class;
        System.out.println(sa.getName());
        System.out.println(sa.getCanonicalName());
        Class<?> t = Test.class;
        System.out.println(t.getName());
        Class<?> in = Test.Inner.class;
        System.out.println(in.getName());
        System.out.println(in.getCanonicalName());
        Class<?> d = double.class;
        System.out.println(d.getName());
        System.out.println(d.getCanonicalName());


    }
}
