package _05_04.before;

import _05_03.end.RunnableExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        // Executor service takes care of configuring and managing threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new RunnableExample());
        executorService.submit(() -> System.out.println("Runnable from lambda"));

        executorService.shutdown();
    }

}
