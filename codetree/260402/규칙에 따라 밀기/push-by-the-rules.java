import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.next());
        char[] q = sc.next().toCharArray();

        for (char c : q) {
            if (c == 'L') {
                char first = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(first);
            } else {
                char end = sb.charAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
                sb.insert(0, end);
            }
        }

        System.out.println(sb);
    }
}