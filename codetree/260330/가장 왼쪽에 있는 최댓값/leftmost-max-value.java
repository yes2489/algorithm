import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        // n개의 정수 중 최댓값의 위치 출력 (가장 먼저 등장하는 위치)
        int n = sc.nextInt();
        int[] arr = new int[n];
        int idx = 0;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;

            if (num > max) {
                max = num;
                idx = i;
            }
        }

        System.out.print((idx + 1) + " ");

        // 위에서 출력한 최대값의 위치보다 왼쪽에 있는 정수들 중 최댓값을 구해 그 위치 출력 반복.
        // 최종적으로 첫 번째 원소가 뽑히면 종료       
        while (idx > 0) {
            int range = idx;

            int newIdx = 0;
            max = arr[0];

            for (int i = 0; i < range; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    newIdx = i;
                }
            }

            idx = newIdx;
            System.out.print((idx + 1) + " ");
        }
    }
}