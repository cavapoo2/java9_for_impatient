package com.andyr.impatient9.ch3;

import java.util.Random;

public class C3E16 {
    public static void main(String[] args) {
        IntSequence is = randomInts(4,10);
        for(int i=0; i < 20; i++){
            System.out.println(is.next());
        }


    }
    private static Random gen = new Random();

     public interface IntSequence {
        static IntSequence of(int... args ) {
            return new IntSequence() {
                private int p=0;
                @Override
                public boolean hasNext() {
                    return p < args.length;
                }
                @Override
                public int next() {
                    return hasNext() ? args[p++] : 0;
                }
            };
        }
        default boolean hasNext() { return true;};//basic implementation
        default int next() {return 0;};//basic
    }

    public static IntSequence randomInts(int low, int high) {
         class RandomSequence implements IntSequence {
             public int next() { return low + gen.nextInt(high- low + 1);}

         }
         return new RandomSequence();
    }
}
