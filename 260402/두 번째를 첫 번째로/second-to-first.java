import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        char[] arr = str.toCharArray();
        char compare = arr[1];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == compare) {
                arr[i] = arr[0];
            }
        }
        
        System.out.println(String.valueOf(arr));
    }
}