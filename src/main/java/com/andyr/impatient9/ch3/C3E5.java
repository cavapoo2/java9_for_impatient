package com.andyr.impatient9.ch3;

import java.util.stream.Stream;

public class C3E5 {
    public static void main(String[] args) {
        IntSequence is = IntSequence.constant(3);
        for(int i = 0; i < 20; i++) {
            System.out.printf("%d ",is.next());
        }

    }
    interface IntSequence {
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

        static IntSequence constant(int v ){
            return new IntSequence() {
                @Override
                public boolean hasNext() {
                    return true;
                }
                @Override
                public int next() {
                    return v;
                }

            };
        }
        default boolean hasNext() { return true;};//basic implementation
        default int next() {return 0;};//basic
    }
}
