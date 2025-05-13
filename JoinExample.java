class ThreadOne extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread One - Count: " + i);
            try {
                Thread.sleep(500); // simulate some work
            } catch (InterruptedException e) {
                System.out.println("Thread One interrupted.");
            }
        }
    }
}

class ThreadTwo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Two - Count: " + i);
            try {
                Thread.sleep(500); // simulate some work
            } catch (InterruptedException e) {
                System.out.println("Thread Two interrupted.");
            }
        }
    }
}

public class JoinExample {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        t1.start(); // Start first thread

        try {
            t1.join(); // Wait for ThreadOne to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        t2.start(); // Start second thread after t1 finishes
    }
}

