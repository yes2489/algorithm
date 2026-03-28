import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num >= 250) {
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