import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.reverse());
    }
}