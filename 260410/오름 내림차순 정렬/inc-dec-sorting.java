import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        // 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 오름차순 정렬
        Arrays.sort(arr);
        for (int v : arr) {
            System.out.print(v + " ");
        }

        System.out.println();

        // 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        for (int v : arr) {
            System.out.print(v + " ");
        }
    }
}