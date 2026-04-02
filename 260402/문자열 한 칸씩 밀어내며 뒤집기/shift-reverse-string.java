import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = sc.next();
        int len = str.length();
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int question = sc.nextInt();
            if (question == 1) {
                str = str.substring(1) + str.charAt(0);
            }
            if (question == 2) {
                str = str.substring(len - 1) + str.substring(0, len - 1);
            }
            if (question == 3) {
                sb.append(str);
                str = sb.reverse().toString();
            }
            System.out.println(str);
            sb.setLength(0);
        }
    }
}