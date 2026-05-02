import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(getNum(n));
    }

    static int getNum(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return getNum(n / 2) + 1;
        } else {
            return getNum(n * 3 + 1) + 1;
        }
    }
}