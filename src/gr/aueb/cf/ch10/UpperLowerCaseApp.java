package gr.aueb.cf.ch10;

/**
 * This class transforms any string "demodemodemo" to "DeMoDeMoDeMo"
 */

public class UpperLowerCaseApp {

    public static void main(String[] args) {
        String message = "Athens";
        StringBuilder sb = new StringBuilder();
        String subStr;
        String s;

        for (int i = 0; i < message.length(); i++) {
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(message.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(message.charAt(i)));
            }
        }

        System.out.println(sb);


    }
}
