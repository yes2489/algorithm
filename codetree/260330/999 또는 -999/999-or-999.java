import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(true) {
            int num = sc.nextInt();
            if (num == 999 || num == -999) {
                break;
            }

            if (num > max) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }

        System.out.printf("%d %d", max, min);
    }
}