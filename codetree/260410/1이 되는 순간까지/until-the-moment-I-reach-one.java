import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int ans = f(n);
        System.out.println(ans);
    }

    static int f(int n) {
        if (n == 1) 
            return 0;

        if (n % 2 == 0) {
            return f(n / 2) + 1;
        } else {
            return f(n / 3) + 1;
        }
    }
}