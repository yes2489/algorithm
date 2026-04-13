import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[202];
        int offset = 100;
        
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            for (int j = x1 + offset; j < x2 + offset; j++) {
                arr[j]++;
            }
        }
        
        int max = 0;
        for (int j : arr) {
            max = Math.max(max, j);
        }
        
        System.out.println(max);
    }
}