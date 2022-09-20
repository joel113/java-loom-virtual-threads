package com.joel.java;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {

    public Main() {
        virtualThreads1();
    }

    private void virtualThreads1() {
        try(ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0,10000).forEach(i -> {
                executor.submit(() -> {
                   Thread.sleep(Duration.ofSeconds(1));
                   return i;
                });
            });
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}