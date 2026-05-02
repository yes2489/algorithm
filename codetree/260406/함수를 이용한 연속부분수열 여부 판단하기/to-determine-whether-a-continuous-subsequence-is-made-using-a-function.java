import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.

        System.out.println(isContainArr(a, b) ? "Yes" : "No");
    }

    static boolean isContainArr(int[] a, int[] b) {
        if (b.length > a.length)
            return false;

        for (int i = 0; i <= a.length - b.length; i++) {
            boolean same = true;
            for (int j = 0; j < b.length; j++) {
                if (a[i + j] != b[j]) {
                    same = false;
                    break;
                }
            }
            if (same) return true;
        }

        return false;
    }
}