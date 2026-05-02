import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        
        System.out.print(isLeapYear(y));
    }

    static boolean isLeapYear(int n) {
        return (n % 4 == 0 && n % 100 != 0) || (n % 400 == 0);
    }
}