import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int sum = a + b + c;

        System.out.printf("%d\n%d\n%d", sum, sum / 3, sum - (sum / 3));
        
    }
}