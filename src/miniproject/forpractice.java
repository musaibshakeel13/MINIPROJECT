package miniproject;

import java.util.Scanner;
public class forpractice {
    public static void main(String[] args) {
        String user;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your marks for percentage %");
            float num = sc.nextFloat();
            float percentage = num / 500 * 100;
            System.out.println("your marks for percentage %" + percentage + "%");
            sc.nextLine();
            System.out.println("want to again check");
            user = sc.nextLine();
        } while (user.equals("continue"));

    }
}
