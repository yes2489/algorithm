import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        System.out.println(findMin(a, b, c));
    }
    static int findMin(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}