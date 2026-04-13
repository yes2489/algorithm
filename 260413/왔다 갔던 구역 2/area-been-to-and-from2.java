import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[2001];
        int idx = 1000;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            
            if (dir == 'L') {
                for (int j = 0; j < x; j++){
                    idx--;
                    arr[idx]++;
                }
            } else {
                for (int j = 0; j < x; j++) {
                    arr[idx]++;
                    idx++;
                }
            }
        }
        
        int ans = 0;
        for (int i : arr) {
            if (i > 1)
                ans++;
        }
        System.out.println(ans);
    }
}