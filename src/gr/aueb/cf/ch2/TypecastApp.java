package gr.aueb.cf.ch2;

public class TypecastApp {
    public static void main(String[] args) {
        int num1 = 10; // int literal -> 32bit
        long num2 = 20L; //

        num2=num1; // implicit typecast
//        System.out.println("num2: " + num2 + " " + num2.getClass().getName());
    }
}
