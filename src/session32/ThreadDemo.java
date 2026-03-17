package session32;

public class ThreadDemo {
    public static void main(String[] args) {

        class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println("Thread extended from Thread with name: " + Thread.currentThread().getName());
            }
        }

        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.start();
        t2.start();

        class MyRunnable implements Runnable {

            @Override
            public void run() {
                System.out.println("Thread implemented from Runnable with name: " + Thread.currentThread().getName());
            }
        }

        Thread t3 = new Thread(new MyRunnable());
        Thread t4 = new Thread(new MyRunnable());
        t3.start();
        t4.start();


        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(2);
        executorService.submit(() -> System.out.println("Thread from Exxecutors with name: " + Thread.currentThread().getName()));
        executorService.shutdown();

        java.util.stream.IntStream.range(1, 5)
                .parallel()
                .forEach(i -> System.out.println("Thread " + i + "  from Stream parallel with name :" + Thread.currentThread().getName()));
    }
}
