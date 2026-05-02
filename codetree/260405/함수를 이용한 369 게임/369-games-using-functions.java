import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.

        int cnt = 0;

        for (int i = A; i <= B; i++) {
            if (contains369(i) || isMultipleOf3(i)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static boolean contains369 (int n) {
        String temp = String.valueOf(n);

        return temp.contains("3") || temp.contains("6") || temp.contains("9");
    }

    static boolean isMultipleOf3 (int n) {
        return n % 3 == 0;
    }
}