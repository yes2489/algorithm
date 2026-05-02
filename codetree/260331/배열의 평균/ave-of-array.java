import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[2][4];
        int sum = 0;

        // 가로 평균
        for (int i = 0; i < 2; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextInt();
                rowSum += matrix[i][j];
                sum += matrix[i][j];
            }
            System.out.printf("%.1f ", (double) rowSum / 4);
        }
        System.out.println();

        // 세로 평균
        for (int i = 0; i < 4; i++) {
            int colSum = 0;
            for (int j = 0; j < 2; j++) {
                colSum += matrix[j][i];
            }
            System.out.printf("%.1f ", (double) colSum / 2);
        }
        System.out.println();

        // 전체 평균
        System.out.printf("%.1f ", (double) sum / 8);
    }
}