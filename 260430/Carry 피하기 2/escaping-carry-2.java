import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = carry(arr[i], arr[j], arr[k]);
                    max = Math.max(max, sum);
                }
            }
        }

        System.out.println(max);
    }

    static int carry(int a, int b, int c) {
        int sum = a + b + c;

        while (a > 0 || b > 0 || c > 0) {
            if ((a % 10 + b % 10 + c % 10) >= 10) {
                return  -1;
            }

            a /= 10;
            b /= 10;
            c /= 10;
        }
        
        return sum;
    }
}