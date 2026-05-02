import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n & 1); // 마지막 비트 삽입
            n = n >> 1; // 오른쪽으로 1칸 이동
        }

        System.out.println(sb.reverse());
    }
}