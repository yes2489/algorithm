import java.util.Scanner;

public class Main {
    static int[] arr;
    static int[] temp;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        arr = new int[n];
        temp = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        mergeSort(0, n - 1);
        
        for (int i : arr)
            System.out.print(i + " ");
        
    }
    
    static void mergeSort(int left, int right) {
        // 원소가 1개면 정렬 완료
        if (left >= right) return;
        
        // 배열 반으로 나누기
        int mid = (left + right) / 2;
        
        // 왼쪽 부분 정렬
        mergeSort(left, mid);
        
        // 오른쪽 부분 정렬
        mergeSort(mid + 1, right);
        
        // 정렬된 두 부분 하나로 합치기
        merge(left, mid, right);
    }
    
    static void merge (int left, int mid, int right) {
        int i = left; // 왼쪽 배열 시작 위치
        int j = mid + 1; // 오른쪽 배열 시작 위치
        int k = left; // temp에 넣을 위치
        
        // 왼쪽, 오른쪽 둘 다 원소가 남아있는 동안 비교
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        
        // 왼쪽 배열에 남은 원소 복사
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        // 오른쪽 배열에 남은 원소 복사
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        
        //temp에 정렬된 결과를 다시 arr에 복사
        for (int x = left; x <= right; x++) {
            arr[x] = temp[x];
        }
    }
}
