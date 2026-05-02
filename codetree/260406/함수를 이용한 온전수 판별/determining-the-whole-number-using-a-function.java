import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (isValidNumber(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static boolean isValidNumber(int num) {
        return num % 2 != 0
                && !endsWithFive(num)
                && !((num % 3 == 0) && (num % 9 != 0));
    }

    static boolean endsWithFive(int num) {
        return num % 10 == 5;
    }
}