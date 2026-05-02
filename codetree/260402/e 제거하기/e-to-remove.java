import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int idx = str.indexOf("e");

        str = str.substring(0, idx) + str.substring(idx + 1);

        System.out.println(str);
    }
}