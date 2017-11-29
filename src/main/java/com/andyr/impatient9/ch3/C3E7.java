package com.andyr.impatient9.ch3;

import java.util.Iterator;
import java.util.function.Consumer;

public class C3E7 {
    public static void main(String[] args) {
        /*
        C3E7 obj = new C3E7();
        obj.UseD();*/
        DigitSequence ds = new DigitSequence(9993156);
        ds.forEachRemaining(x -> System.out.println(x));
    }
    /*
    public void UseD() {
        DigitSequence ds = new DigitSequence(9993156);
        ds.forEachRemaining(x -> System.out.println(x));
    }*/

    /*private*/ static class DigitSequence implements Iterator<Integer> {
        private Integer num;
        public DigitSequence(int n) {
            num = n;
        }
        @Override
        public boolean hasNext() {
            return num != 0;
        }
        @Override
        public Integer next() {
            Integer result = num % 10;
            num /= 10;
            return result;
        }
        public int rest() {
            return num;
        }
        @Override
        public void forEachRemaining(Consumer action) {
            while (hasNext()){
                action.accept(next());
            }
        }
        @Override
        public void remove(){}

    }

}
