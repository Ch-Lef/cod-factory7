package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfBufferedCopyApp {

    public static void main(String[] args) {

        int b;
        int count = 0;
        long start;
        long endTimestamp;
        double elapsedTime = 0.0;
        byte[] buffer = new byte[8192]; // 8kb buffer

        try (FileInputStream fis = new FileInputStream("C:/tmp/dummy.pdf");
             FileOutputStream fos = new FileOutputStream("C:/tmp/dummy-out.pdf")) {
            start = System.currentTimeMillis();
            while ((b = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, b);
                count++;
            }
            endTimestamp = System.currentTimeMillis();
            elapsedTime = (endTimestamp - start) / 1000.0;

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Bytes copied: " + count / 1024.0);
        System.out.println("Time elapsed: " + elapsedTime + " ms");

    }
}
