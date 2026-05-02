import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); // idx
        String t = sc.next(); // 시작하는 단어
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        Arrays.sort(words);

        int idx = 1;
        for (int i = 0; i < n; i++) {
            if (words[i].startsWith(t)) {
                if (idx == k) {
                    System.out.println(words[i]);
                    break;
                }
                idx++;
            }
        }
    }
}