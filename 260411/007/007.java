import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char c = sc.next().charAt(0);
        int i = sc.nextInt();

        Code code = new Code(s, c, i);

        System.out.printf("secret code : %s\nmeeting point : %c\ntime : %d", code.secret, code.location, code.time);
    }
}

class Code {
    String secret;
    char location;
    int time;

    public Code(String secret, char location, int time) {
        this.secret = secret;
        this.location = location;
        this.time = time;
    }
}