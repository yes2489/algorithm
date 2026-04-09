import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        System.out.println(hasDiff(A)? "Yes": "No");
    }

    static boolean hasDiff(String s) {
        char first = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != first){
                return true;
            }
        }

        return false;
    }
}