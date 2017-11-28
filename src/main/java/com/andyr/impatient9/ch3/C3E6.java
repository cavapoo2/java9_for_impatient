package com.andyr.impatient9.ch3;
import java.math.BigInteger;
public class C3E6 {
    interface Sequence<T> {
        default boolean hasNext() { return true;}
        T next();
    }
    public static void main(String[] args){
        SquareSequence ss = new SquareSequence(BigInteger.valueOf(1));
        for(int i=0; i < 100; i++){
            System.out.println(ss.next());
        }
    }

    static class SquareSequence implements Sequence<BigInteger> {
        private BigInteger val;
        SquareSequence(BigInteger start) {
            this.val = start;
        }
        @Override
        public BigInteger next() {
            BigInteger res = val.multiply(val);
            val = val.add(BigInteger.valueOf(1));
            return res;
        }

    }
}
