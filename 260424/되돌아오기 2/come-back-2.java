import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] d = sc.next().toCharArray();

        // N W S E
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, -1, 0, 1};

        int r = 0, c = 0, sec = 0, dir = 0;
        boolean isReturn = false;

        for (int i = 0; i < d.length; i++) {
            sec++;

            if (d[i] == 'L') {
                dir = (dir + 1 + 4) % 4;
            } else if (d[i] == 'R') {
                dir = (dir + 1) % 4;
            } else { // 전진
                r += dr[dir];
                c += dc[dir];
            }

            if (r == 0 && c == 0) {
                isReturn = true;
                break;
            }
        }

        if (!isReturn) {
            sec = -1;
        }

        System.out.println(sec);
    }
}