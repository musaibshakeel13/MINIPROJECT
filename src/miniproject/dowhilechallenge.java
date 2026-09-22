package miniproject;

import java.util.Scanner;
public class dowhilechallenge {
    public static void main(String[] args) {
        int input=0;
        do{
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first number ");
        int a=sc.nextInt();
        System.out.println("Enter the second number ");
        int b=sc.nextInt();
        int sum=a+b;

            System.out.println(sum);
            System.out.println("press 1 to continue");
             input=sc.nextInt();

        } while(input==1);
    }
}
