import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        str = str.substring(1) + str.charAt(0);

        System.out.println(str);
    }
}