import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        // 1의 자리로 채우기... 문제 제대로 읽기...
        for (int i = 2; i < 10; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 10;
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}