package com.andyr.impatient9.ch2;

public class C2E4 {
    public static void main(String[] args) {
        IntHolder a = new IntHolder(10);
        IntHolder b = new IntHolder(20);
        System.out.println("Before swap = " + a.toString() + " " + b.toString());
        swapInts(a,b);
        System.out.println("After swap = " + a.toString() + " " + b.toString());
    }
    private static class IntHolder {
        private int value;
        public IntHolder(int value){
            this.value = value;
        }
        public int getValue() { return value;}
        public void setValue(int newValue) {this.value = newValue;}
        public String toString () {
            return String.format("%d",this.value);
        }
    }
    private static void swapInts(IntHolder a, IntHolder b) {
        int temp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }

}
