import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            int num;
            if (input.equals("push_back")) {
                num = sc.nextInt();
                arr.add(num);
            } else if (input.equals("pop_back")) {
                arr.remove(arr.size() - 1);
            } else if (input.equals("size")) {
                System.out.println(arr.size());
            } else {
                num = sc.nextInt();
                System.out.println(arr.get(num-1));
            }
        }
    }
}