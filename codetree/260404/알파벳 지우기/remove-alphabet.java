import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int aDigits = extractDigits(a);
        int bDigits = extractDigits(b);

        System.out.println(aDigits + bDigits);
    }
    
    static int extractDigits(String s) {
        StringBuilder digits = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            }
        }
        
        return Integer.parseInt(digits.toString());
    }
}