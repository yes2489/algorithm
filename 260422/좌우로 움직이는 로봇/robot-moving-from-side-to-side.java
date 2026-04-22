import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] aDir = new char[n];
        char[] bDir = new char[m];
        int[] aTime = new int[1000001];
        int[] bTime = new int[1000001];
        int aTotal = 0;
        int bTotal = 0;

        for (int i = 0; i < n; i++) {
            aTime[i] = sc.nextInt();
            aDir[i] = sc.next().charAt(0);
            aTotal += aTime[i];
        }

        for (int i = 0; i < m; i++) {
            bTime[i] = sc.nextInt();
            bDir[i] = sc.next().charAt(0);
            bTotal += bTime[i];
        }

        int maxTime = Math.max(aTotal, bTotal);
        int[] a = new int[maxTime + 1];
        int[] b = new int[maxTime + 1];

        int idx = 1;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < aTime[i]; j++) {
                if (aDir[i] == 'L')
                    cur--;
                else
                    cur++;
                a[idx++] = cur;
            }
        }
        while(idx <= maxTime) {
            a[idx++] = cur;
        }

        idx = 1;
        cur = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < bTime[i]; j++) {
                if (bDir[i] == 'L')
                    cur--;
                else
                    cur++;
                b[idx++] = cur;
            }
        }
        while(idx <= maxTime) {
            b[idx++] = cur;
        }

        boolean samePos = false;
        int ans = 0;

        for (int i = 1; i <= maxTime; i++) {
            if (a[i] == b[i] && !samePos) {
                ans++;
                samePos = true;
            }
            if (a[i] != b[i] && samePos) {
                samePos = false;
            }
        }
        System.out.println(ans);
    }
}