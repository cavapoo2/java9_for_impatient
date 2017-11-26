package com.andyr.impatient9.ch2;

public class C2E15 {
    public static void main(String[] args) {
        Invoice i = new Invoice();
        i.addItem("Apples",100,0.5);
        i.addItem("Pears",75,0.45);
        i.addItem("Grapes",5000,1.25);
        i.show();
    }
}
