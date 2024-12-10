package gr.aueb.cf.ch2;

public class PrintApp {
    public static void main(String[] args) {
        int day = 10;
        int month = 7;
        int year = 2024;
        System.out.println("Ημερομηνία: " + day + "/" + month + "/" + year);
        System.out.printf("Ημερομηνία: %2d/02d/%04d\n", day, month, year);
    }
}
