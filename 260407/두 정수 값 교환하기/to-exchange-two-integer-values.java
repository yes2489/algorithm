import java.util.Scanner;

public class Main {
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.

        swap(n, m);
        System.out.println(n + " " + m);
    }
    static void swap(int a, int b) {
        n = b;
        m = a;
    }
}