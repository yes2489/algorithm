import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        
        for (int i = 1; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 3 == 0) {
                break;
            }
            ans = num;
            
            if (num % 3 != 0 && i == 9) {
                ans = 0;
            }
        }

        System.out.println(ans);
    }
}