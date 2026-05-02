import java.util.Scanner;
public class Main {
    static int a, b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        // Please write your code here.
        calcNum(a, b);
        System.out.println(a + " " + b);
    }

    static void calcNum(int x, int y){
        if (x > y) {
            a *= 2;
            b += 10;
        } else {
            a += 10;
            b *= 2;
        }
    }
}