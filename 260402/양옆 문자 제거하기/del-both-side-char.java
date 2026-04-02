import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        str = str.substring(0, 2) + str.substring(3, str.length()-2) + str.substring(str.length()-1);
        
        System.out.print(str);
    }
}