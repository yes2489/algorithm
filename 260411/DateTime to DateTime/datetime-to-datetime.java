import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.

        int ans = 0, date = 11, hour = 11, min = 11;
        
        while(true) {
            if (A <= 11 && B <= 11 && C < 11) {
                ans = -1;
                break;
            }
            if (date == A && hour == B && min == C) {
                break;
            }

            ans++;
            min++;
            if (min >= 60) {
                min = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                    date++;
                }
            }
        }

        System.out.println(ans);
    }
}