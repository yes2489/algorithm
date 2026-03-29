import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            String str = sc.next();
            if (i == 1 || i == 4 || i == 7) {
                System.out.print(str + " ");
            }
        }
    }
}