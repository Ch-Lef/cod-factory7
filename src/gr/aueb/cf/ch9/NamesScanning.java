package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class NamesScanning {
    public static void main(String[] args) {
        String inFilePath = "C:/tmp/names.txt";
        String outFilePath = "C:/tmp/names-formatted.txt";
        String line;
        String[] tokens;


        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s+");
                printFormatter(ps, tokens);
                printFormatter(System.out, tokens);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void printFormatter(PrintStream ps, String[] tokens) {
        ps.printf("{ \"First name\": \"%s\", \"Last name\": \"%s\" \"City\": \"%s\" }%n", tokens[0], tokens[1], tokens[2]);
    }

}