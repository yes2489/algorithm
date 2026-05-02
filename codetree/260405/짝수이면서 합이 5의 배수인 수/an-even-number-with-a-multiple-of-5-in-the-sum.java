import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.print(isMagicNumber(n));
    }

    static String isMagicNumber(int n) {
        if (n % 2 == 0 && ((n / 10) + (n % 10)) % 5 == 0) return "Yes";
        return "No";
    }
}