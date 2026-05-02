import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char x = sc.next().charAt(0);

        char priv = (char) ((x - 'a' - 1 + 26) % 26 + 'a');
        System.out.println(priv);
    }
}