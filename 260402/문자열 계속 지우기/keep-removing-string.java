import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        while (a.contains(b)) {
            int idx = a.indexOf(b);
            a = a.substring(0, idx) + a.substring(idx + b.length());
        }
        
        System.out.println(a);
    }
}