import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();

        int max = 0;

        // A를 0번 사용하는 경우부터 c를 넘지 않을 때까지 반복
        for (int i = 0; A * i <= C; i++) {
            // B를 0번 사용하는 경우부터 A*i + B*j가 C를 넘지 않을 때까지 반복
            for (int j = 0; (A * i) + (B * j) <= C; j++) {
                int sum = (A * i) + (B * j);

                if (sum > max)
                    max = sum;
            }
        }

        System.out.println(max);
    }
}