import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            dq.addLast(i);
        }

        while (dq.size() > 1) {
            dq.pollFirst(); // 맨 첫 숫자 뽑아내기
            
            // 남은 수열의 맨 앞 정수 맨 뒤로 이동
            int num = dq.pollFirst();
            dq.addLast(num);
        }

        System.out.println(dq.pollFirst());
    }
}