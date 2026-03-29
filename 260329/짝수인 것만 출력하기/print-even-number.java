import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }

        for (int num : evenList) {
            System.out.print(num + " ");
        }
    }
}