import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        int ans = 0;
        for (int i = x; i <= y; i++) {
            sb.append(i);
            sb.reverse();
            if (sb.toString().equals(String.valueOf(i)))
                ans++;
            
            sb.setLength(0);
        }

        System.out.println(ans);
    }
}