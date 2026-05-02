import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.next());
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int question = sc.nextInt();

            if (question == 1) {
                char first = sb.charAt(0); // 맨 앞 문자 저장
                sb.deleteCharAt(0); // 맨 앞 문자 삭제
                sb.append(first); // 맨 앞 문자를 맨 뒤에 붙이기
            }else if (question == 2) {
                char last = sb.charAt(sb.length() - 1); // 맨 뒤 문자 저장
                sb.deleteCharAt(sb.length() - 1); // 맨 뒤 문자 삭제
                sb.insert(0, last); // 맨 뒤 문자를 맨 앞에 삽입
            } else if (question == 3) {
                sb.reverse();
            }
            System.out.println(sb);
        }
    }
}