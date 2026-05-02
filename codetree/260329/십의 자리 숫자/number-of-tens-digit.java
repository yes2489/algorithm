import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] countArr = new int[10];

        while(true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            countArr[num / 10]++;
        }

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d - %d\n", i, countArr[i]);
        }

    }
}