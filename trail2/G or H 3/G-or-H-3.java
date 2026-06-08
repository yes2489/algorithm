import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 인덱스를 위치로 사용
        int[] arr = new int[10001];

        // 입력받은 위치에 해당 사람이 들고있는 사진 정보 저장
        for (int i = 0; i < n; i++) {
            int idx = sc.nextInt();          // 위치
            char input = sc.next().charAt(0); // 사진 종류

            if (input == 'G')
                arr[idx] = 1; // G는 1점
            else
                arr[idx] = 2; // H는 2점
        }
        
        int max = Integer.MIN_VALUE;

        // 시작 위치를 0 ~ 10000까지 모두 시도
        for (int i = 0; i <= 10000; i++) {
            int sum = 0;

            // 길이가 k인 구간 [i, i+k]의 점수 합 계산
            for (int j = i; j <= i + k && j <= 10000; j++) {
                sum += arr[j];
            }
            
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
    }
}
