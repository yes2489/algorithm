import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[101];

        for (int i = 0; i < n; i++) {
            int spot = sc.nextInt();
            char input = sc.next().charAt(0);
            arr[spot] = input;
        }

        int max = -1;

        for (int i = 0; i <= 100; i++) {
            if (arr[i] == 0) continue;

            int g = 0;
            int h = 0;

            for (int j = i; j <= 100; j++) {
                if (arr[j] == 'G')
                    g++;
                if (arr[j] == 'H')
                    h++;

                if (arr[j] == 'G' || arr[j] == 'H') {
                    if (g == 0 || h == 0 || g == h) {
                        max = Math.max(max, j - i);
                    }
                }
            }
        }

        System.out.println(max);
    }
}