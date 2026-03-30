import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] checkArr = new int[1000];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            checkArr[num]++;
        }

        // 최댓값 구하기
        int max = -1;

        for (int i = checkArr.length - 1; i >= 0; i--) {
            if (checkArr[i] == 1) {
                max = i;
                break;
            }
        }

        System.out.print(max);
    }
}