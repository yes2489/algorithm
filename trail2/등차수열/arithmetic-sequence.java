import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];

                if (sum % 2 != 0) continue; // k가 자연수가 아니므로 continue

                map.put(sum, map.getOrDefault(sum, 0) + 1); // 없는 키가 들어 올 경우 기본 값(0)을 반환
                ans = Math.max(ans, map.get(sum));
            }
        }

        System.out.println(ans);
    }
}