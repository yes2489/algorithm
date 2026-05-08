import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dots = new int[n][2];

        for (int i = 0; i < n; i++) {
            dots[i][0] = sc.nextInt(); // x
            dots[i][1] = sc.nextInt(); // y
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;

                maxX = Math.max(maxX, dots[j][0]);
                maxY = Math.max(maxY, dots[j][1]);
                minX = Math.min(minX, dots[j][0]);
                minY = Math.min(minY, dots[j][1]);
            }

            int width = (maxX - minX) * (maxY - minY);

            min = Math.min(min, width);
        }

        System.out.println(min);
    }
}