import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];

        // 수열 a
        for (int i = 0; i < n1; i++) {
            int num = sc.nextInt();
            a[i] = num;
        }

        // 수열 b
        for (int i = 0; i < n2; i++) {
            int num = sc.nextInt();
            b[i] = num;
        }

        String ans = "No";

        // 연속 부분 수열인가?
        for (int i = 0; i <= n1 - n2; i++) {
            boolean same = true;
            
            for (int j = 0; j < n2; j++) {
                if (a[i+j] != b[j]) {
                    same = false;
                    break;
                }
            }
            
            if (same) {
                ans = "Yes";
                break;
            }
        }

        System.out.println(ans);
    }
}