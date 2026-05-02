import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        printSeason(y, m, d);
    }

    static boolean isValidDate(int year, int month, int date) {
        int[] days = {0, 31, 28, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31};

        // 윤년 확인
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            days[2] = 29;
        }

        return date <= days[month];
    }

    static void printSeason(int year, int month, int date) {
        if (!isValidDate(year, month, date)) {
            System.out.println(-1);
            return;
        };

        switch (month) {
            case 3: case 4: case 5:
                System.out.print("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.print("Fall");
                break;
            default:
                System.out.println("Winter");
        }
    }
}
