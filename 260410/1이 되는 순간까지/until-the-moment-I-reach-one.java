import java.util.Scanner;
public class Main {
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int ans = f(n);
        System.out.println(ans);
    }

    static int f(int n) {
        if (n == 1) 
            return cnt;

        cnt++;
        if (n % 2 == 0) {
            return f(n / 2);
        } else {
            return f(n / 3);
        }
    }
}