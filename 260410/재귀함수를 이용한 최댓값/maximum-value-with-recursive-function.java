import java.util.Scanner;
public class Main {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.println(maxNum(n));
    }

    static int maxNum(int n) {
        if (n == 1)
            return arr[0];
        
        return Math.max(maxNum(n - 1), arr[n - 1]);
    }
}a