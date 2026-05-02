import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next(), b = sc.next();

        System.out.println(Integer.parseInt(a + b) + Integer.parseInt(b + a));
    }
}