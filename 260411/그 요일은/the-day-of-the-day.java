import java.util.Scanner;

public class Main {

    static String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}; // 월요일 기준
    static int[] date = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String findDay = sc.next();
        int idx = 0;

        // 기준 찾기
        for (int i = 0; i < 7; i++) {
            if (day[i].equals(findDay)){
                idx = i;
                break;
            }
        }

        int diff = getDayOfYear(m2, d2) - getDayOfYear(m1, d1);

        if (diff < idx) {
            System.out.println(0);
        } else {
            System.out.println((diff - idx) / 7 + 1);
        }
    }

    static int getDayOfYear(int m, int d) {
        int days = 0;

        for (int i = 0; i < m; i++) {
            days += date[i];
        }

        return days + d;
    }
}