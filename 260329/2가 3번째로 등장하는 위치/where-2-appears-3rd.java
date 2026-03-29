import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            if (num == 2) {
                cnt++;
                if (cnt == 3) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}