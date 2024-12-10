package gr.aueb.cf.ch8;

import java.io.IOException;

public class ExceptionTypes {
    public static void main(String[] args) {

    }

    /**
     * \
     * Reads a single character from the standard input.
     *
     * @return the character read.
     * @throws IOException if an I/O error occurs.
     */
    public static char readOneChar() throws IOException {
        return (char) System.in.read();
    }

    public static char readAnotherChar() {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return ' ';
        }
    }

}

