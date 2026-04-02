import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        StringBuilder ans = new StringBuilder();

        int cnt = 1;
        ans.append(a.charAt(0));

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i - 1) == a.charAt(i)) {
                cnt++;
            } else {
                ans.append(cnt);
                ans.append(a.charAt(i));
                cnt = 1;
            }
        }

        ans.append(cnt);

        System.out.println(ans.length());
        System.out.println(ans);
    }
}