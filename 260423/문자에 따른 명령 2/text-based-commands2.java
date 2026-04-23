import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] dir = s.toCharArray();

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int x  = 0, y = 0;
        int idx = 3;

        for (char c : dir) {
            if (c == 'L') {
                idx = (idx - 1 + 4) % 4;
            } else if (c == 'R') {
                idx = (idx + 1) % 4;
            } else if (c == 'F') {
                x += dx[idx];
                y += dy[idx];
            }
        }
        System.out.println(x + " " + y);
    }
}