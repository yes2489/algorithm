import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int len = 0;

        for (int i = 0; i < 10; i++) {
            String str = sc.next();
            len += str.length();
        }
    }
}