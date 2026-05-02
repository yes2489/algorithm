import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] time = input.split(":");

        System.out.printf("%d:%s", Integer.parseInt(time[0]) + 1, time[1]);
    }
}