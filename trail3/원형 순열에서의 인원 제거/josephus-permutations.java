import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();

        while (!q.isEmpty()) {
            for (int i = 1; i < k; i++) {
                int person = q.poll();
                q.add(person);
            }
            int out= q.poll();
            sb.append(out).append(" ");
        }

        System.out.println(sb.toString().trim()); // 양 끝 공백 삭제
    }
}