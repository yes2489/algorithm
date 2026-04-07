import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        System.out.println(isPalindrome(input) ? "Yes" : "No");
    }

    static boolean isPalindrome(String s) {
        StringBuilder sc = new StringBuilder(s);
        return sc.toString().contentEquals(sc.reverse());
    }
}