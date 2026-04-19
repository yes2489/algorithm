import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 1;
        int current = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i]) {
                current++;
            } else {
                current = 1;
            }
            max = Math.max(max, current);
        }

        System.out.println(max);
    }
}