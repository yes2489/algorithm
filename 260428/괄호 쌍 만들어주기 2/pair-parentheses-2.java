import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        char[] arr = input.toCharArray();
        int ans = 0;

        for (int i = 1; i < arr.length - 2; i++) {
            if (arr[i - 1] == '(' && arr[i] == '(') {
                for (int j = i + 1; j < arr.length - 1; j++) {
                    if (arr[j] == ')' && arr[j + 1] == ')') 
                        ans++;
                }
            }
        }

        System.out.println(ans);
    }
}