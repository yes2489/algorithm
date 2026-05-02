import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int current = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > t) {
                current++;
            } else {
                current = 0;
            }
            max = Math.max(max, current);
        }

        System.out.println(max);
    }
}