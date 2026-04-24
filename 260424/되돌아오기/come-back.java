import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // E S W N
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int r = 0, c = 0, sec = 0, dir = 0;
        boolean isReturn = false;

        for (int i = 0; i < n; i++) {
            if (isReturn)
                break;

            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            dir = findDir(d);

            for (int j = 0; j < t; j++) {
                sec++;
                r += dr[dir];
                c += dc[dir];

                if (r == 0 && c == 0) {
                    isReturn = true;
                    break;

                }
            }
        }

        if (!isReturn){
            sec = -1;
        }
        
        System.out.println(sec);
    }

    static int findDir(char d) {
        if (d == 'E')
            return  0;
        else if (d == 'S')
            return 1;
        else if (d == 'W')
            return 2;
        else // d == 'N'
            return 3;
    }
}