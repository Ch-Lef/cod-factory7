package gr.aueb.cf.ch2;

/**
 * Η κλάση ExpressionsApp περιέχει παραδείγματα απλών αριθμητικών εκφράσεων.
 */

public class ExpressionsApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;
       // result1=num1++;
       // result2=++num1;

        System.out.printf("Άθροισμα: %d + %d = %d\n", num1, num2, sum);
        System.out.printf("Διαφορά: %d - %d = %d\n", num1, num2, sub);
        System.out.printf("Πολλαπλασιασμός: %d * %d = %d\n", num1, num2, mul);
        System.out.printf("Διαίρεση: %d / %d = %d\n", num1, num2, div);
        System.out.printf("Υπόλοιπο: %d %% %d = %d\n", num1, num2, mod);
        System.out.printf("Αύξηση: %d++ = %d\n", num1, result1);
        System.out.printf("Αύξηση: ++%d = %d\n", num1, result2);
        System.out.printf("%d %d", ++num1 , num1);



    }
}
