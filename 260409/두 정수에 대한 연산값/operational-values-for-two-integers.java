import java.util.Scanner;

public class Main {
    static int a, b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        // Please write your code here.
        calcNums(a, b);
        System.out.println(a + " " + b);
    }

    static void calcNums(int x, int y) {
        if (x > y) {
            a += 25;
            b *= 2;
        } else {
            a *= 2;
            b += 25;
        }
    }
}