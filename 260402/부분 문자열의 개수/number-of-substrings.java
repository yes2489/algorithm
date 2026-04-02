import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        int cnt = 0;

        for (int i = 0; i < a.length() - 1; i++) {
            String tmp = a.substring(i, i +2);
            if (tmp.equals(b)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}