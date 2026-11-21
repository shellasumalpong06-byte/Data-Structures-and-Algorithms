
public class Main {
    static int[] stack = new int[5];
    static int top = -1;

    public static void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full.");
        } else {
            stack[++top] = value;
            System.out.println(value + " added to stack.");
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println(stack[top--] + " removed from stack.");
        }
    }

    public static void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        display();

        pop();

        display();
    }
}
