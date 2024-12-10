package gr.aueb.cf.ch6;

public class MyStack {

    static int[] stack = new int[50];
    static int top = -1;

    public static void main(String[] args) {


    }

    public static void push(int num) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        stack[++top] = num;
    }

    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top--];
    }

    private static void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    private static boolean isFull() {
        return top == stack.length - 1;
    }

    private static boolean isEmpty() {
        return top == -1;
    }
}