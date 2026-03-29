import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int evenIndexSum = 0;
        int multipleSum = 0;
        int cnt = 0;

        for (int i = 1; i < 11; i++) {
            int num = sc.nextInt();
            if (i % 2 == 0) {
                evenIndexSum += num;
            }
            if ((i) % 3 == 0) {
                multipleSum += num;
                cnt++;
            }
        }
        System.out.printf("%d %.1f", evenIndexSum, (double) multipleSum / cnt);
        
    }
}