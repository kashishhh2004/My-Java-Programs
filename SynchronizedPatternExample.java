class PatternPrinter {
    // synchronized method to print stars
    synchronized void printStars() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("* * * * *");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Star thread interrupted.");
            }
        }
    }

    // synchronized method to print numbers
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("1 2 3 4 5");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Number thread interrupted.");
            }
        }
    }
}

// Thread to print stars
class StarThread extends Thread {
    PatternPrinter printer;

    StarThread(PatternPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printStars();
    }
}

// Thread to print numbers
class NumberThread extends Thread {
    PatternPrinter printer;

    NumberThread(PatternPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printNumbers();
    }
}

public class SynchronizedPatternExample {
    public static void main(String[] args) {
        PatternPrinter printer = new PatternPrinter();

        StarThread t1 = new StarThread(printer);
        NumberThread t2 = new NumberThread(printer);

        t1.start();
        t2.start();
    }
}
