import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] white = new int[200001];
        int[] black = new int[200001];
        char[] color = new char[200001];

        int idx = 100000;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'R') {
                for (int j = 0; j < x; j++) {
                    int cur = idx + j;
                    black[cur]++;
                    color[cur] = 'B';
                }
                idx += x - 1; // 마지막으로 칠한 타일의 위치
            } else {
                for (int j = 0; j < x; j++) {
                    int cur = idx - j;
                    white[cur]++;
                    color[cur] = 'W';
                }
                idx -= x - 1;
            }
        }

        int w = 0, b = 0, g = 0;
        for (int i = 0; i < white.length; i++) {
            if (white[i] >= 2 && black[i] >= 2){
                g++;
            } else if (color[i] == 'W') {
                w++;
            } else if (color[i] == 'B') {
                b++;
            }
        }

        System.out.println(w + " " + b + " " + g);
    }
}