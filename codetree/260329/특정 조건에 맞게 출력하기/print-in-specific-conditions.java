import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while(true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                System.out.print(num / 2 + " ");
            } else {
                System.out.print((num + 3) + " ");
            }
        }
    }
}