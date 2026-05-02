import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        
        System.out.println(a.substring(0, 2) + b.substring(2, b.length()));
    }
}