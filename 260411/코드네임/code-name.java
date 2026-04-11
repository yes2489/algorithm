import java.util.*;

class Agent {
    char code;
    int score;

    public Agent(char code, int score) {
        this.code = code;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Agent[] list = new Agent[5];

        for (int i = 0; i < 5; i++) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();
            list[i] = new Agent(c, s);
        }

        Arrays.sort(list, Comparator.comparingInt(a -> a.score));
        
        System.out.println(list[0].code + " " + list[0].score);
    }
}
