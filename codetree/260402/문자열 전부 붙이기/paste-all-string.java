import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String ans = "";

        for (int i = 0; i < n; i++) {
            ans += sc.next();
        }
        
        System.out.println(ans);
    }
}