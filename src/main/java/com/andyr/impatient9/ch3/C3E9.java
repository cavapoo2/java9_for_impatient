package com.andyr.impatient9.ch3;

public class C3E9 {
    public static void main(String[] args){
        Thread g1 = new Thread(new Greeter(10,"Blue"));
        Thread g2 = new Thread(new Greeter(10,"Red"));
        g1.start();
        g2.start();
    }

    static class Greeter implements Runnable {
        private int n;
        private String target;
        @Override
        public void run() {
            for (int i=0; i < n; i++) {
                System.out.println("Hello " + target);
            }

        }
        Greeter(int n, String target) {
            this.n = n;
            this.target = target;
        }

    }

}
