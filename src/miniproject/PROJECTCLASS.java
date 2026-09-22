package miniproject;

import java.util.Scanner;
public class PROJECTCLASS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first character letter:");
           char ch=sc.next().charAt(0);
           int ch1=ch;
        System.out.println("Your charecter is :"+ch);
        System.out.println("the ASCII of your character latter is :"+ch1);

    }
}
