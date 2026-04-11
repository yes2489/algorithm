import java.util.Scanner;

class Member {
    String id;
    int level;

    public Member(){
        this.id = "codetree";
        this.level = 10;
    }

    public Member(String id, int level) {
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String id = sc.next();
        int level = sc.nextInt();

        Member user1 = new Member();
        Member user2 = new Member(id, level);
        
        System.out.println("user " + user1.id + " lv " +user1.level);
        System.out.println("user " + user2.id + " lv " +user2.level);
    }
}