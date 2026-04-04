import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        StringBuilder aDigits = new StringBuilder();
        StringBuilder bDigits = new StringBuilder();

        for (char c : a.toCharArray()) {
            if (Character.isDigit(c)) {
                aDigits.append(c);
            }
        }

        for (char c : b.toCharArray()) {
            if (Character.isDigit(c)) {
                bDigits.append(c);
            }
        }

        System.out.println(Integer.parseInt(aDigits.toString()) + Integer.parseInt(bDigits.toString()));
    }
}