import java.util.*;

class Person {
    String name;
    String addr;
    String city;

    public Person(String name, String addr, String city){
        this.name = name;
        this.addr = addr;
        this.city = city;
    }

    @Override
    public String toString() {
        return "name " + name + "\n" + "addr " + addr + "\n" +"city " + city;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] list = new Person[n];

        for (int i = 0; i < n; i++) {
            String s = sc.next(), a = sc.next(), c = sc.next();
            list[i] = new Person(s, a, c);
        }

        Arrays.sort(list, Comparator.comparing(p -> p.name));

        System.out.println(list[n-1].toString());
    }
}
