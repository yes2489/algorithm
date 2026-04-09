import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printN(n);
    }
    
    static void printN(int n) {
        if (n == 0) return;

        System.out.println("HelloWorld");
        printN(n - 1);
    }
}