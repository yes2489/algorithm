import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char[] word = {'L', 'E', 'B', 'R', 'O', 'S'};
        char input = sc.next().charAt(0);

        int idx = -1;

        for (int i = 0; i < 6; i++) {
            if (input == word[i]) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            System.out.print(idx);
        } else {
            System.out.print("None");
        }
        
    }
}