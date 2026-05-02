import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String ee = "No";
        String ab = "No";

        if(str.contains("ee")) {
            ee = "Yes";
        }
        if (str.contains("ab")) {
            ab = "Yes";
        }

        System.out.printf("%s %s", ee, ab);
    }
}