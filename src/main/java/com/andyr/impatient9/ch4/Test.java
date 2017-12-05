package com.andyr.impatient9.ch4;

public class Test {
    private int a;
    private String s;
    private double[] arr;
    public Test(int a, String s, double[] arr) {
        this.a = a;
        this.s = s;
        this.arr = arr;
    }

    public class Inner {
        private String name;
        public Inner(String n) {
            this.name = n;
        }
    }
}
