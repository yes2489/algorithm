import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 최대 인덱스 100을 커버하기 위해 102 크기로 선언
        int[] arr = new int[102];

        for (int i = 0; i < n; i++) {
            int cnt = sc.nextInt(); // 추가할 수량
            int idx = sc.nextInt(); // 값을 넣을 위치
            arr[idx] += cnt;        // 기존 위치의 값에 누적하여 더함
        }

        // 최댓값을 저장할 변수
        int max = Integer.MIN_VALUE;

        // 가능한 모든 중심 위치를 순회하며 최대 합을 구함
        for (int i = 0; i <= 100; i++) {
            int sum = 0; // 현재 위치 i를 기준으로 범위 내에 있는 값들의 합

            // 현재 위치 i를 중심으로 좌우 k 범위 내의 모든 인덱스를 탐색
            for (int j = i - k; j <= i + k; j++) {
                // 인덱스 j가 배열의 유효한 범위 안에 있을 때만 합산
                if (0 <= j && j <= 100)
                    sum += arr[j];
            }

            // 최댓값 갱신
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}