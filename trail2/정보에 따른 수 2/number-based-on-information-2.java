import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Integer> sPos = new ArrayList<>();
        ArrayList<Integer> nPos = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            char c = sc.next().charAt(0);
            int x = sc.nextInt();

            if (c == 'S') {
                sPos.add(x);
            } else {
                nPos.add(x);
            }
        }

        int ans = 0;

        for (int k = a; k <= b; k++) {
            int minS = Integer.MAX_VALUE;
            int minN = Integer.MAX_VALUE;

            for (int s : sPos) {
                minS = Math.min(minS, Math.abs(k - s));
            }

            for (int n : nPos){
                minN = Math.min(minN, Math.abs(k - n));
            }

            if (minS <= minN) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}