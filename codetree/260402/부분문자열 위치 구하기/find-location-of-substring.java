import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String sub = sc.next();

        if (str.contains(sub)) {
            System.out.println(str.indexOf(sub));
        } else {
            System.out.print(-1);
        }
    }
}