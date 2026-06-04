import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        // 첫 번쨰 원소는 이미 정렬된 상태로 간주하므로 인덱스 1부터 시작
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // 삽입 할 원소
            int j = i - 1; // 이미 정렬된 배여르이 마지막 원소 인덱스

            // key값과 정렬된 배열의 원소들을 뒤에서부터 비교
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for (int i : arr)
            System.out.print(i + " ");
    }
}