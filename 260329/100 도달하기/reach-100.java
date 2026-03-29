import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = sc.nextInt();

        int idx = 2;

        while(true) {
            arr[idx] = arr[idx-1] + arr[idx-2];
            idx++;

            if (arr[idx-1] > 100) {
                break;
            }
        }

        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}