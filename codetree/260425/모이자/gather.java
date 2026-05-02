import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int sumDist = 0;

            for (int j = 0; j < n; j++) {
                if (i != j)
                    sumDist += Math.abs(i - j) * arr[j];
            }

            minDist = Math.min(minDist, sumDist);
        }

        System.out.println(minDist);
    }
}