import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String input = sc.next(); // yyyy.mm.dd
        String[] date = input.split("\\.");

        System.out.printf("%s-%s-%s", date[1], date[2], date[0]);
    }
}