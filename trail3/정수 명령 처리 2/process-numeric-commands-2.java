import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            if (input.equals("push")) {
                q.add(sc.nextInt());
            }
            else if (input.equals("pop")) {
                if (!q.isEmpty())  {
                    int num = q.poll();
                    System.out.println(num);
                } else {
                    return;
                }
            } else if (input.equals("size")) {
                System.out.println(q.size());
            } else if (input.equals("empty")) {
                System.out.println(q.isEmpty()? 1 : 0);
            } else if (input.equals("front")) {
                System.out.println(q.peek());
            }
        }
    }
}