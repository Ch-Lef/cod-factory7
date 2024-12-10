package gr.aueb.cf.ch3;

/*
 * demo of surrogate pairs
 */

public class UnicodeApp {
    public static void main(String[] args) {
        int codePoint = 0x1F600;
        System.out.println("codePoint: " + codePoint);

        System.out.println("Smile: \uD83D\uDE03");
        System.out.println("codePoint: " + Character.toChars(codePoint));
        System.out.println("codePoint: " + new String(Character.toChars(codePoint)));
    }
}
