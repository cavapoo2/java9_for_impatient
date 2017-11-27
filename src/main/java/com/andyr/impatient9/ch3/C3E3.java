package com.andyr.impatient9.ch3;

public class C3E3 {
    public static void main(String[] args) {
        IntSequence is = IntSequence.of(1,2,3,4,5,6,7,8);
        while(is.hasNext()){
            System.out.println(is.next());
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
        default boolean hasNext() { return true;};//basic implementation
        default int next() {return 0;};//basic
    }

}

