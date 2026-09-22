package miniproject;

import java.util.Scanner;
public class factorialofanumber {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact=1,i=1;
        while(number>=i){
            fact=fact*i;

            i++;
            System.out.print("Factorial of  "+(i-1));

            System.out.println(" is "+fact);
        }
    }
}
