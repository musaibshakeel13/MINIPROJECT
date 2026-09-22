package miniproject;

import java.util.Scanner;

public class METHODSINJAVAWITHPARAME {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        display("musaib",6 );
    }
    public static void display(String name,int number){
        int i=1;
        while(i<number){
            System.out.println(i + " " + name);
            i++;
        }
    }
}
