import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        // Please write your code here.
        int num = 0;
        
        for (int i = 0; i < n.length(); i++) {
            num = num * a + (n.charAt(i) - '0');
        }

        System.out.println(convert(num, b));        
    }
    
    static String convert(int num, int b) {
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            sb.append(num%b);
            num /= b;
        }
        return sb.reverse().toString();
    }
}
