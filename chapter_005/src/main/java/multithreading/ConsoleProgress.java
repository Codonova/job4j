package multithreading;


public class ConsoleProgress implements Runnable {
    @Override
    public void run() {
        int i = 0;
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.print("\r load: " + process(i++));
               Thread.sleep(500);
                if (i == 3) {
                    i = 0;
                }
            }
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    public static char process(int i) {
        char c = '\\';
        if (i == 1) {
            c = '|';
        } else if (i == 2) {
            c = '/';
        }
        return c;
    }


    public static void main(String[] args) throws InterruptedException {
        Thread progress = new Thread(new ConsoleProgress());
        progress.start();
        Thread.sleep(3000);
        progress.interrupt();


    }
}
