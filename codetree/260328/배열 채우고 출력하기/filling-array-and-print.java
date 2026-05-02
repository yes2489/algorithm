import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];

        for(int i = 9; i >= 0; i--) {
            arr[i] = sc.next();
        }
        
        for(String v : arr) {
            System.out.print(v);
        }
    }
}