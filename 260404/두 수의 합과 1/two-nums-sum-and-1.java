import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        String str = Integer.toString(a + b);
        int ans = 0;

        for (char c : str.toCharArray()) {
            if ('1' == c) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}