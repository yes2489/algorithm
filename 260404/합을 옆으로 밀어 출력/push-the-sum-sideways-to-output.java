import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        String str = Integer.toString(sum);
        
        if (str.length() > 1) {
            str = str.substring(1) + str.charAt(0);
        }

        System.out.println(str);
    }
}