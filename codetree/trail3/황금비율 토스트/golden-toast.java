import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 초기 식빵 개수
        int m = sc.nextInt(); // 명령어 개수

        String init = sc.next();

        // 커서 기준 왼쪽, 오른쪽 스택 생성
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        // 처음에는 커서가 맨 뒤에 있으므로 모든 문자를 left에 추가
        for (int i = 0; i < init.length(); i++) {
            left.push(init.charAt(i));
        }

        // m개의 명령어 처리
        for (int i = 0; i < m; i++) {

            String input = sc.next();
            char cmd = input.charAt(0);

            switch (cmd) {
                case 'L':
                    if (!left.isEmpty()) {
                        right.push(left.pop());
                    }
                    break;

                case 'R':
                    if (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                    break;

                case 'D':
                    if (!right.isEmpty()) {
                        right.pop();
                    }
                    break;

                case 'P':
                    String str = sc.next();
                    char value = str.charAt(0);
                    left.push(value);
                    break;
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        StringBuilder sb = new StringBuilder();
        while (!right.isEmpty()) {
            sb.append(right.pop());
        }

        System.out.println(sb);
        sc.close();
    }
}