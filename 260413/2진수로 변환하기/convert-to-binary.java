import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n%2);
            n /= 2;
        }

        System.out.println(sb.reverse());
    }
}