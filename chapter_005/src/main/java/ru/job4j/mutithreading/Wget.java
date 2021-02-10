package ru.job4j.mutithreading;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Wget implements Runnable {

    private final String url;
    private final int speed;

    public Wget(String url, int speed) {
        this.url = url;
        this.speed = speed;
    }

    @Override
    public void run() {

        long startTime;
        long size = 0;

        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream("pom_tmp.xml")) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                startTime = System.currentTimeMillis();
                size += bytesRead;
                if (size >= speed) {
                    if ((System.currentTimeMillis() - startTime) < 1000L)
                        Thread.sleep(1000L - (System.currentTimeMillis() - startTime));
                }
                fileOutputStream.write(dataBuffer, 0, bytesRead);
                size = 0;
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        String url = "https://raw.githubusercontent.com/peterarsentev/course_test/master/pom.xml";
        int speed = Integer.parseInt("512");
        Thread wget = new Thread(new Wget(url, speed));
        wget.start();
        wget.join();
    }
}
