import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                char[] arr = str.toCharArray();
                char tmp = arr[a-1];

                arr[a-1] = arr[b-1];
                arr[b-1] = tmp;

                str = String.valueOf(arr);
            } else {
                String x = sc.next();
                String y = sc.next();
                str = str.replaceAll(x, y);
            }

            System.out.println(str);
        }
    }
}
