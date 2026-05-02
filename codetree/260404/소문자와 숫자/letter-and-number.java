import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('A' <= c && c <= 'Z') {
                System.out.print(String.valueOf(c).toLowerCase());
            } else if ('a' <= c && c <= 'z') {
                System.out.print(c);
            } else if ('0' <= c && c <= '9') {
                System.out.print(c);
            }
        }
    }
}