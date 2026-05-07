import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] question = new int[n];
        int[] cnt1 = new int[n];
        int[] cnt2 = new int[n];

        for (int i = 0; i < n; i++) {
            question[i] = sc.nextInt();
            cnt1[i] = sc.nextInt();
            cnt2[i] = sc.nextInt();
        }

        int ans = 0;

        for (int a1 = 1; a1 <= 9; a1++) {
            for (int a2 = 1; a2 <= 9; a2++) {
                for (int a3 = 1; a3 <= 9; a3++) {

                    if (a1 == a2 || a1 == a3 || a2 == a3)
                        continue;

                    boolean possible = true;

                    for (int i = 0; i < n; i++) {
                        int num = question[i];

                        int b1 = num / 100;
                        int b2 = num / 10 % 10;
                        int b3 = num % 10;

                        int pcnt1 = 0;
                        int pcnt2 = 0;

                        if (a1 == b1) pcnt1++;
                        if (a2 == b2) pcnt1++;
                        if (a3 == b3) pcnt1++;

                        if (b1 != a1 && (b1 == a2 || b1 == a3)) pcnt2++;
                        if (b2 != a2 && (b2 == a1 || b2 == a3)) pcnt2++;
                        if (b3 != a3 && (b3 == a1 || b3 == a2)) pcnt2++;

                        if (pcnt1 != cnt1[i] || pcnt2 != cnt2[i]) {
                            possible = false;
                            break;
                        }
                    }

                    if (possible)
                        ans++;
                }
            }
        }

        System.out.println(ans);
    }
}