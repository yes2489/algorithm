import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int[] ta = new int[n];
        int[] tb = new int[n];

        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }

        int max = 0;

        // 모든 온도를 다 확인해보자..
        for (int i = 0; i <= 1000; i++) {
            int work = 0;

            for (int j = 0; j < n; j++) {
                if (i < ta[j])
                    work += c;
                else if (ta[j] <= i && i <= tb[j])
                    work += g;
                else
                    work += h;
            }

            max = Math.max(max, work);
        }

        System.out.println(max);
    }
}