import java.util.Scanner;

public class Main {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.println(getLcm(n));
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    static int getLcm(int n) {
        if (n == 1)
            return arr[0];
        
        return lcm(getLcm(n - 1), arr[n - 1]);
    }
}