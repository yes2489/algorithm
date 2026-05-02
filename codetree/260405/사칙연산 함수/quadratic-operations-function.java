import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        calc(a, o, c);
    }

    static boolean isOperation(char o) {
        return o == '+' || o == '-' || o == '/' || o == '*';
    }

    static void add(int a, int b) {
        System.out.printf("%d + %d = %d", a, b, a + b);
    }

    static void sub(int a, int b) {
        System.out.printf("%d - %d = %d", a, b, a - b);
    }

    static void div(int a, int b) {
        System.out.printf("%d / %d = %d", a, b, a / b);
    }

    static void multiply(int a, int b) {
        System.out.printf("%d * %d = %d", a, b, a * b);
    }

    static void calc(int a, char o, int c) {
        if (!isOperation(o)) {
            System.out.print("False");
            return;
        }

        switch (o) {
            case '+':
                add(a, c);
                break;
            case '-':
                sub(a, c);
                break;
            case '/':
                div(a, c);
                break;
            case '*':
                multiply(a, c);
                break;
        }
    }
}