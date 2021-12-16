package me.tuhin.concurrency;

public class VisibilityProblem extends Thread {
    //    use volatile for solve the issue
    //    volatile

    boolean keepRunning = true;

    public static void main(String[] args) throws InterruptedException {
        VisibilityProblem t = new VisibilityProblem();
        t.start();
        Thread.sleep(1000);
        t.keepRunning = false;
        System.out.println(System.currentTimeMillis() + ": keepRunning is " + t.keepRunning);
    }

    public void run() {
        while (keepRunning) {
        }
        System.out.println(System.currentTimeMillis());
    }
}