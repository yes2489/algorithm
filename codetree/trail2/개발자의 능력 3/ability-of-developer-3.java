import java.util.Scanner;

public class Main {
    static int[] ability = new int[6];
    static int total = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
            total += ability[i];
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                for(int k = j + 1; k < 6; k++) {
                    min = Math.min(min, getDiff(i, j, k));
                }
            }
        }

        System.out.println(min);
    }

    static int getDiff(int a, int b, int c) {
        int sum1 = ability[a] + ability[b] + ability[c];
        int sum2 = total - sum1;
        return Math.abs(sum1 - sum2);
    }
}