import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int maxValue = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            int num = sc.nextInt();
            if (num > maxValue) {
                maxValue = num;
            }
        }

        System.out.println(maxValue);
    }
}