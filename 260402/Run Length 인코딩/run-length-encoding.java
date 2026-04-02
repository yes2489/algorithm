import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        StringBuilder ans = new StringBuilder();
        int cnt = 1;

        for (int i = 0; i < a.length(); i++) {
            if (i == 0) {
                ans.append(a.charAt(i));
                continue;
            }

            if (a.charAt(i-1) == a.charAt(i)) {
                cnt++;
            } else {
                ans.append(cnt);
                ans.append(a.charAt(i));
                cnt = 1;
            }

            if (i == a.length() - 1) {
                ans.append(cnt);
                break;
            }
        }
        System.out.println(ans.length());
        System.out.println(ans);
    }
}