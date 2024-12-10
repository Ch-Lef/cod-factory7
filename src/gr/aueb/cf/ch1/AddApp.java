package gr.aueb.cf.ch1;

/**
 * Η κλάση AddApp πραγματοποιεί την πρόσθεση δύο ακεραίων αριθμών και εκτυπώνει το αποτέλεσμα.
 */

public class AddApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση των μεταβλητών
        int num1 = 19;
        int num2 = 30;
        int result = num1 + num2;
        // Εκτύπωση του αποτελέσματος
        System.out.println("Το αποτέλεσμα της πρόσθεσης είναι ίσο με: " + result);
        System.out.println("Το άθροισμα των " + num1 + ", " + num2 + " είναι ίσο με: " + result);
        System.out.printf("Το άθροισμα των %d, %d είναι ίσο με: %d\n", num1, num2, result);
    }
}
