import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] countArr = new int[11];

        while(true) {
            int num = sc.nextInt();

            if (num == 0) break;
            if (num < 10) continue;

            countArr[num / 10]++;
        }

        for (int i = 10; i > 0; i--) {
            System.out.printf("%d - %d\n", i * 10, countArr[i]);
        }
    }
}