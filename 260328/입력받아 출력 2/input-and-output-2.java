import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] id = input.split("-");

        System.out.printf("%s%s", id[0], id[1]);
    }
}