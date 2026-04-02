import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(sc.next());
        }
        
        String str = sb.toString();
        
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if ((i+1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}