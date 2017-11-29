package com.andyr.impatient9.ch3;

public class C3E10 {
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
    public static void main(String[] args) throws InterruptedException{
        Runnable[] tasks= new Greeter[10];
        for(int i=0; i < 10; i++) {
            tasks[i] = new Greeter(5,String.valueOf(i));
        }
        System.out.println("Run together first");
        runTogether(tasks);
        Thread.sleep(2000);
        System.out.println("Run in order");
        runInOrder(tasks);

    }
    public static void runTogether(Runnable... tasks)
    {
        for(Runnable task : tasks){
            Thread t = new Thread( task );
            t.start();
        }

    }
    public static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks){
            task.run();
        }
    }
}
