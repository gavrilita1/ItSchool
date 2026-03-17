package session32;

public class Counter {

    static class UnsafeCounter {
        private int count = 0;

        public void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    static class SafeCounter{
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public synchronized int getCount() {
            return count;
        }
    }



    public static void main(String[] args) throws InterruptedException {
        UnsafeCounter unsafeCounter = new UnsafeCounter();
        Thread t1 = new Thread( () -> {
            for (int i = 0; i < 10000; i++) unsafeCounter.increment();
        }, "Thread unsafe 1");
        Thread t2 = new Thread( () -> {
            for (int i = 0; i < 10000; i++) unsafeCounter.increment();
        }, "Thread unsafe 2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(unsafeCounter.getCount());


        SafeCounter safeCounter = new SafeCounter();
        Thread t3 = new Thread( () -> {
            for (int i = 0; i < 10000; i++) safeCounter.increment();
        }, "Thread safe 3");
        Thread t4 = new Thread( () -> {
            for (int i = 0; i < 10000; i++) safeCounter.increment();
        }, "Thread safe 4");

        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println(safeCounter.getCount());
    }
}
