import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (isPrime(i) && isSumEven(i)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static boolean isPrime(int n) {
        if (n < 2) 
            return false;
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isSumEven(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum % 2 == 0;
    }
}