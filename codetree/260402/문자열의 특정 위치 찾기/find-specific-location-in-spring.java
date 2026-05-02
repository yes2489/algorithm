import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        int ans = str.indexOf(c);

        if (ans == -1) {
            System.out.print("No");
        } else {
            System.out.print(ans);
        }
    }
}