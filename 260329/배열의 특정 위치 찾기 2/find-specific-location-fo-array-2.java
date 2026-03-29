import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            if (i % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println(Math.abs(evenSum - oddSum));
    }
}