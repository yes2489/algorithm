import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String b = String.valueOf(n);
        int num = 0;

        for (int i = 0; i < b.length(); i++) {
            num = num * 2 + (b.charAt(i) - '0');
        }
        num *= 17;
        StringBuilder sb = new StringBuilder();

        while(num > 0) {
            sb.append(num & 1);
            num = num >> 1;
        }

        System.out.println(sb.reverse());
    }
}