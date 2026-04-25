import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int max = 0;

        for (int i = 0; i < a.length(); i++) {
            char[] arr = a.toCharArray();
            arr[i] = (arr[i] == '0') ? '1' : '0';
            
            int val = Integer.parseInt(new String(arr), 2);
            max = Math.max(max, val);
        }
        
        System.out.println(max);
    }
}