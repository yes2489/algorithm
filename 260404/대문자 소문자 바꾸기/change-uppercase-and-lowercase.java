import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            } else {
                System.out.print(Character.toLowerCase(c));
            }
        }
    }
}