import java.util.Scanner;

public class Main {
    static int[] ability = new int[6]; // 개발자 능력치
    static int total = 0; // 개발자 총 능력치

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
            total += ability[i];
        }

        int min = Integer.MAX_VALUE;

        // 6명 중 3명을 뽑는 조합
        // 중복 및 순서 바뀌는 것을 방지하기 위해 j는 i+1, k는 j+1부터 시작
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                for(int k = j + 1; k < 6; k++) {
                    // 현재 선택된 3명으로 팀을 나눴을 때의 차이 계산 후 최솟값 갱신
                    min = Math.min(min, getDiff(i, j, k));
                }
            }
        }

        System.out.println(min);
    }

    static int getDiff(int a, int b, int c) {
        // 뽑힌 3명의 능력치 합
        int sum1 = ability[a] + ability[b] + ability[c];

        // 나머지 3명 능력치 합
        int sum2 = total - sum1;

        // 두 팀의 능력치 차이 절댓값 반환
        return Math.abs(sum1 - sum2);
    }
}
