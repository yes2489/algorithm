import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] aDir = new char[1000000];
        char[] bDir = new char[1000000];
        int[] aTime = new int[1000000];
        int[] bTime = new int[1000000];
        // 총 이동 시간 (a, b 동일)
        int total = 0;

        // 입력
        for (int i = 0; i < n; i++) {
            aDir[i] = sc.next().charAt(0);
            aTime[i] = sc.nextInt();
            total += aTime[i];
        }

        for (int i = 0; i < m; i++) {
            bDir[i] = sc.next().charAt(0);
            bTime[i] = sc.nextInt();
        }

        // 초 당 위치 기록
        int[] aArr = new int[total + 1];
        int[] bArr = new int[total + 1];

        int idx = 1;
        int cur = 0;

        for (int i = 0; i < aDir.length; i++) {
            for (int j = 0; j < aTime[i]; j++) {
                if (aDir[i] == 'L')
                    cur--;
                else
                    cur++;

                aArr[idx++] = cur;
            }
        }

        idx = 1;
        cur = 0;
        for (int i = 0; i < bDir.length; i++) {
            for (int j = 0; j < bTime[i]; j++) {
                if (bDir[i] == 'L')
                    cur--;
                else
                    cur++;

                bArr[idx++] = cur;
            }
        }
        
        int ans = -1;
        for (int i = 1; i < total; i++) {
            if (aArr[i] == bArr[i]) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}
