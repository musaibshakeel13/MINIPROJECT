package miniproject;

import java.util.Scanner;

public class thirdchall {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >=21) {
            if (age > 55) {
                System.out.println("senior acc");
            }
        else{
                System.out.println("saving acc");
        }}

        else{
            System.out.println("inligible");
        }

    }
}
