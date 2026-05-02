import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ans = str.toCharArray();
        ans[1] = 'a';
        ans[ans.length - 2] = 'a';
        
        for (char s : ans) {
            System.out.print(s);
        }
    }
}