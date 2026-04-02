import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};   
        char input = sc.next().charAt(0);
        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            if (input == arr[i].charAt(2) || input == arr[i].charAt(3)){
                System.out.println(arr[i]);
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}