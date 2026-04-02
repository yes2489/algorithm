import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next();
        }

        String c = sc.next();
        boolean isExist = false;

        for (int i = 0; i < 10; i++) {
            if (arr[i].endsWith(c)) {
                System.out.println(arr[i]);
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println("None");
        }
    }
}