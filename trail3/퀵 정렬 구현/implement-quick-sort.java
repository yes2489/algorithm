import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr)
            System.out.print(num + " ");
    }

    static void quickSort(int[]arr, int start, int end) {
        if (start >= end) return;

        int pivot = arr[(start + end) / 2];
        int left = start;
        int right= end;

        while (left <= right) {
            while (arr[left] < pivot)
                left++;
            while (arr[right] > pivot)
                right--;

            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        quickSort(arr, start, right);
        quickSort(arr, left, end);

    }
}
