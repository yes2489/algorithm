import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int x = (int) sc.next().charAt(0);
        int y = (int) sc.next().charAt(0);

        System.out.println((x + y) + " " + (Math.abs(x-y)));
    }
}