import java.util.Scanner;

class Product {
    String name;
    int code;

    public Product() {
        name = "codetree";
        code = 50;
    }

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int c = sc.nextInt();

        Product p1 = new Product();
        Product p2 = new Product(n, c);

        System.out.println("product " + p1.code + " is " + p1.name);
        System.out.println("product " + p2.code + " is " + p2.name);
    }
}