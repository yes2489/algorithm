import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] countArr = new int[10];
        int a = sc.nextInt(), b = sc.nextInt();

        while(true) {
            if (a <= 1) {
                break;
            }

            int tmp = a;
            countArr[tmp % b]++;

            a /= b;
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += (int) Math.pow(countArr[i], 2);
        }

        System.out.print(sum);
    }
}