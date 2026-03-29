import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[100];
        int cnt = 0;

        for (int i = 1; i <= 100; i++) {
            arr[i] = n * i;

            System.out.print(arr[i] + " ");

            if (arr[i] % 5 == 0) {
                cnt++;
                if (cnt == 2) {
                    break;
                }
            }
        }
    }
}