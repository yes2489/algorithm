import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next(), b = sc.next();
        String A = "", B = "";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isDigit(c)) {
                A += c;
            } else {
                break;
            }
        }

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (Character.isDigit(c)) {
                B += c;
            } else {
                break;
            }
        }

        System.out.println(Integer.parseInt(A) + Integer.parseInt(B));
    }
}