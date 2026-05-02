import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int w = sc.nextInt(), h = sc.nextInt();
        w += 8;
        h *= 3;

        System.out.println(w + "\n" + h + "\n" + (w * h));
    }
}