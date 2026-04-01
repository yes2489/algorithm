import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine(), b = sc.nextLine();

        System.out.print(a.replaceAll(" ", "") + b.replaceAll(" ", ""));
    }
}