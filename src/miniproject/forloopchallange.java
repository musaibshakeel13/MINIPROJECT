package miniproject;

import java.util.Scanner;
public class forloopchallange {
    public static void main(String[] args) {
        int input=0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number:");
            int num = sc.nextInt();
            for (int i = 1; i <= 10; i++) {

                System.out.println(num + "*" + i + " = " + (num * i));
            }
            System.out.println("want to print another number table press 1");
            input=sc.nextInt();
        }while(input==1);
    }
}
