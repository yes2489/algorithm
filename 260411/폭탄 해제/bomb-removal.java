import java.util.Scanner;

class Solution {
    String code;
    char color;
    int sec;

    public Solution(String code, char color, int sec) {
        this.code = code;
        this.color = color;
        this.sec = sec;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String code = sc.next();
        char color = sc.next().charAt(0);
        int sec = sc.nextInt();

        Solution s = new Solution(code, color, sec);
        
        System.out.println("code : " + s.code);
        System.out.println("color : " + s.color);
        System.out.println("second : " + s.sec);
    }
}