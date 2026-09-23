package miniproject;

import java.util.Scanner;
public class NUMBERSWAPING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a=sc.nextInt();
        System.out.println("Enter second number :");
        int b=sc.nextInt();
        System.out.println("Before swaping the A valuue is :"+a);
        System.out.println("before swaping the B value  is :"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swaping the A value is :"+a);
        System.out.println("After swaping the B value is :"+b);
    }
}

