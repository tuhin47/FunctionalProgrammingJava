package me.tuhin.finalsection;

import java.util.function.Consumer;

public class _CallBack {
    public static void main(String[] args) {

        helloConsumer("Jhon","Cena", value-> System.out.println("Value:" +value));
        helloRunnable(()-> System.out.println("nope"));
    }

    private static void helloConsumer(String first, String last, Consumer callback) {

        callback.accept(first);
        callback.accept(last);

    }
    private static void helloRunnable(Runnable callback) {

        callback.run();
        callback.run();

    }
}
