public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        for (int i = 0; i < 5; i++) {
            printStars(10);
        }
    }

    static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}