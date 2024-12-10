package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/file-out-ps.txt", true), true, StandardCharsets.UTF_8)) {
            printMessage(ps, "Hello World!");
            printMessage(System.out, "Hello Java!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
