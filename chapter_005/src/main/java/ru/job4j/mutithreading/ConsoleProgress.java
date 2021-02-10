package ru.job4j.mutithreading;


public class ConsoleProgress implements Runnable {
    @Override
    public void run() {
        char[] chars = {'\\', '|', '/'};
        try {
            while (!Thread.currentThread().isInterrupted()) {
                for (char c : chars) {
                    System.out.print("\r load: " + c);
                    Thread.sleep(500);
                }
            }
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread progress = new Thread(new ConsoleProgress());
        progress.start();
        Thread.sleep(3000);
        progress.interrupt();


    }
}
