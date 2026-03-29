import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[3];
        int cnt = 0;

        while(true) {
            int num = sc.nextInt();
            if(num == 0) {
                break;
            }

            arr[cnt % 3] = num;
            cnt++;
        }

        int sum = 0;
        
        for (int i = 0; i < 3; i++){
            sum += arr[i];
        }
        
        System.out.println(sum);
    }
}