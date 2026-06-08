import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // 몇 자리수까지 정렬해야 하는 지 확인 위해 가장 큰 수를 저장
        int max = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        // 1의 자리 -> 10의 자리 -> 100의 자리 ...
        // 가장 큰 수의 자리수까지 비교
        for (int exp = 1; max / exp > 0; exp *= 10) {

            // 현재 자리수를 기준으로 정렬된 결과를 담을 배열
            int[] output = new int[n];
            // 0~9까지의 숫자 개수 저장
            int[] count = new int[10];

            // 빈도수 계산
            for (int i = 0; i < n; i++) {
                int digit = (arr[i] / exp) % 10;
                count[digit]++;
            }

            // 누적합 계산
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            // 뒤에서부터 채우기
            for (int i = n - 1; i >= 0; i--) {

                // 현재 자리수 추출
                int digit = (arr[i] / exp) % 10;

                // count[digit] = digit이 들어갈 마지막 위치 + 1
                output[count[digit] - 1] = arr[i];
                count[digit]--;
            }

            // 원본 배열에 복사
            for (int i = 0; i < n; i++) {
                arr[i] = output[i];
            }
        }

        for (int i : arr)
            System.out.print(i + " ");
    }
}
