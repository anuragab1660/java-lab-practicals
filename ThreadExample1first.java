public class ThreadExample {
    public static void main(String[] args) {
        // Create and start the threads
        Thread threadA = new Thread(new PrintChar('a', 100));
        Thread threadB = new Thread(new PrintChar('b', 100));
        Thread threadC = new Thread(new PrintNumber(100));

        threadA.start();
        threadB.start();
        threadC.start();
    }
}

// Runnable implementation to print a character 'count' times
class PrintChar implements Runnable {
    private char charToPrint;
    private int count;

    public PrintChar(char c, int n) {
        charToPrint = c;
        count = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.print(charToPrint);
        }
    }
}

// Runnable implementation to print numbers from 1 to 'count'
class PrintNumber implements Runnable {
    private int count;

    public PrintNumber(int n) {
        count = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.print(i + " ");
        }
    }
}
