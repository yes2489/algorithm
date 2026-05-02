import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next(), b = sc.next(), c = sc.next();
        
        System.out.println(Math.max(Math.max(a.length(), b.length()), c.length()) - Math.min(Math.min(a.length(), b.length()), c.length()));
    }
}