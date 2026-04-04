import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        while(sc.hasNext()) {
            String str = sc.next();

            if (str.equals("0")) break;

            cnt++;

            if (cnt % 2 != 0) {
                sb.append(str).append("\n");
            }
        }

        System.out.println(cnt);
        System.out.print(sb);
    }
}