import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        String end = sc.next();
        int cnt = 0;
        int len = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i].startsWith(end)) {
                cnt++;
                len += arr[i].length();
            }
        }

        System.out.printf("%d %.2f", cnt, (double) len / cnt);
    }
}