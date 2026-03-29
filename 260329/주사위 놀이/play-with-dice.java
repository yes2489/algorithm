import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] countArr = new int[7];

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            countArr[num]++;
        }

        for (int i = 1; i < 7; i++) {
            System.out.printf("%d - %d\n", i, countArr[i]);
        }
    }
}