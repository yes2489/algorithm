import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // mm-dd-yyyy
        String[] date = input.split("-");

        System.out.printf("%s.%s.%s", date[2], date[0], date[1]);
    }
}