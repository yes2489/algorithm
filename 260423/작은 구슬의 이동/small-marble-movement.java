import java.util.Scanner;
public class Main {
    static int n;

    // R D U L
    static int[] dr = {0, 1, -1, 0};
    static int[] dc = {1, 0, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt(); // 초

        int r = sc.nextInt(), c = sc.nextInt();
        char d = sc.next().charAt(0);

        int idx = direction(d);

        for (int i = 0; i < t; i++) {
            int nr = r + dr[idx];
            int nc = c + dc[idx];

            if (!inRange(nr, nc)) {
                idx = 3 - idx;
            } else {
                r = nr;
                c = nc;
            }
        }

        System.out.println(r + " " + c);
    }

    static boolean inRange(int r, int c) {
        return (1 <= r && r <= n && 1 <= c && c <= n);
    }

    static int direction(char d) {
        if (d == 'R') return 0;
        else if (d == 'D') return 1;
        else if (d == 'U') return 2;
        else return 3; // L
    }
}