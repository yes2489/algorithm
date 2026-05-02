import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int pp = sc.nextInt(), p = sc.nextInt();

        System.out.printf("%d %d ", pp, p);

        for (int i = 2; i < 10; i++) {
            int tmp = p + 2*pp;
            pp = p;
            p = tmp;

            System.out.print(tmp + " ");
        }

    }
}