import java.util.Scanner;

public class Main {
    
    static String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}; // 월요일 기준
    static int[] date = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        // 두 날짜를 연중 몇 번째 날로 변환 후 차이 계산
        int diff = getDayOfYear(m2, d2) - getDayOfYear(m1, d1);

        // 음수 포함 0~6 범위로 정규화
        System.out.println(day[(diff % 7 + 7) % 7]);
    }

    static int getDayOfYear(int m, int d) {
        int days = 0;

        for (int i = 0; i < m; i++) {
            days += date[i];
        }

        return days + d;
    }
}