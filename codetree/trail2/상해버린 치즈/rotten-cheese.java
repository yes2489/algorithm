import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 사람
        int m = sc.nextInt(); // 치즈
        int d = sc.nextInt(); // 먹은 기록 수
        int s = sc.nextInt(); // 특정 사람이 언제 확실히 아팠는지
        int[] person = new int[d];
        int[] cheese = new int[d];
        int[] eatTime = new int[d];


        for (int i = 0; i < d; i++) {
            person[i] = sc.nextInt();
            cheese[i] = sc.nextInt();
            eatTime[i] = sc.nextInt();
        }

        int[] sickPerson = new int[s];
        int[] sickTime = new int[s];

        for (int i = 0; i < s; i++) {
            sickPerson[i] = sc.nextInt();
            sickTime[i] = sc.nextInt();
        }

        int ans = 0;

        // i번째 치즈가 상함
        for (int i = 1; i <= m; i++) {
            boolean possible = true;

            // 아픈 사람 모두가 i번 치즈를 아프기 전에 먹었는지 확인
            for (int j = 0; j < s; j++) {
                int p = sickPerson[j];
                int sick = sickTime[j];

                boolean ateBefore = false;

                for (int k = 0; k < d; k++) {
                    if (person[k] == p && cheese[k] == i && eatTime[k] < sick) {
                        ateBefore = true;
                    }
                }

                if (!ateBefore) {
                    possible = false;
                }
            }

            // i번 치즈가 상한 치즈 후보라면
            if (possible) {
                int cnt = 0;

                // i번 치즈를 먹은 사람 수 세기
                for (int p = 1; p <= n; p++) {
                    boolean ate = false;

                    for (int k = 0; k < d; k++) {
                        if (person[k] == p && cheese[k] == i) {
                            ate = true;
                        }
                    }

                    if (ate) {
                        cnt++;
                    }
                }

                ans = Math.max(ans, cnt);
            }
        }
        
        System.out.println(ans);
    }
}