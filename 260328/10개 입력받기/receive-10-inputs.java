import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                cnt = i;
                break;
            }

            sum += num;
        }

        if (cnt != 0) {
            System.out.printf("%d %.1f", sum, (double) sum / cnt);
        } else {
            System.out.printf("%d %.1f", sum, (double) sum / 10);
        }
    }
}