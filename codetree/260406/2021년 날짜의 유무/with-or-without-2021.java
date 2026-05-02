import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        System.out.println(isValidDate(m, d) ? "Yes" : "No");
    }

    static boolean isValidDate(int month, int date) {
        if (month < 1 || month > 12 || date < 1) return false;

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return date <= days[month];
    }
}