package com.andyr.impatient9.ch3;

public class C3E14 {
    public static void main(String[] args){
        Runnable[] runnables = new Greeter[10];
        for(int i=0; i < 10; i++) {
            runnables[i] = new Greeter(5,String.valueOf(i));
        }
        Runnable runAll = runInOrder(runnables);
        Thread t = new Thread(runAll); //no need to use a different thread, but anyway
        t.start();


    }
    //this will use current thread, I think.
    static Runnable runInOrder(Runnable[] runnables) {

        return new Runnable() {
            @Override
            public void run() {
                for(Runnable r : runnables) {
                    r.run();
                }
            }
        };

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
