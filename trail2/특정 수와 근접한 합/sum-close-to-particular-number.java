import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        // 입력 받은 숫자들을 저장할 배열
        int[] nums = new int[n];

        // 모든 숫자의 총합
        int total = 0;

        // 숫자 입력 받으면서 총합 계산
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            total += nums[i];
        }
        
        int min = Integer.MAX_VALUE;

        // 제외할 첫 번째 숫자 선택
        for (int i = 0; i < n; i++) {

            // 제외할 두 번째 숫자 선택
            // i와 같은 숫자를 고르지 않기 위해 j는 i + 1부터 시작
            for (int j = i + 1; j < n; j++) {

                // 전체 합에서 선택한 두 숫자를 제외한 합
                int sum = total - nums[i] - nums[j];

                // 최솟값 갱신
                min = Math.min(min, Math.abs(s - sum));
            }
        }

        System.out.println(min);
    }
}
