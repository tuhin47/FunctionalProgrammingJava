package me.tuhin.threadExp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalExample {

    ThreadLocal<SimpleDateFormat> formatThreadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));
    private static final ExecutorService executor = Executors.newFixedThreadPool(10);

    public String birthDate(int userId) throws InterruptedException {
        Date birthDate = birthDateById(userId);
        final SimpleDateFormat df = formatThreadLocal.get();
        return df.format(birthDate);
    }

    private Date birthDateById(int id) throws InterruptedException {
        Thread.sleep(500);
        if (id == 92) {
            Thread.sleep(5000);
        }
        return new Date(ThreadLocalRandom.current().nextLong(new Date().getTime()));
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            int id = i;
            executor.submit(() ->{
                try {
                    System.out.println(id + " " + new ThreadLocalExample().birthDate(id));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });
        }

    }

}
