import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c) || Character.isDigit(c)) {
                System.out.print(c);
            }
        }
    }
}