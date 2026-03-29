import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] hospital = new int[4]; // a b c d
        int emergency = 0;
        
        for (int i = 0; i < 3; i++) {
            char cold = sc.next().charAt(0);
            int fever = sc.nextInt();

            if (cold == 'Y' && fever >= 37) {
                hospital[0]++;
                emergency++;
            } else if (cold == 'N' && fever >= 37) {
                hospital[1]++;
            } else if (cold == 'Y' && fever < 37) {
                hospital[2]++;
            } else {
                hospital[3]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(hospital[i] + " ");
        }
        
        if (emergency >= 2) {
            System.out.print("E");
        }

    }
}