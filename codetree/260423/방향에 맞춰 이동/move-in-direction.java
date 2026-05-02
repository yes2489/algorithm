import java.util.Scanner;
public class Main {
    // w s n e
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int d = sc.nextInt();

            int idx = 0;

            if (dir == 'W')
                idx = 0;
            else if (dir == 'S')
                idx = 1;
            else if (dir == 'N')
                idx = 2;
            else if (dir == 'E')
                idx = 3;

            x += dx[idx] * d;
            y += dy[idx] * d;
        }

        System.out.println(x + " "+ y);
    }
}