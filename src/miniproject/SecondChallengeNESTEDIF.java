package miniproject;

import java.util.Scanner;
public class SecondChallengeNESTEDIF {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >13){
            System.out.println("wellcome website");

            if(age<=25 && age >=20) {
                System.out.println("congralution ,you have won discount");
            }
        }
        else if(age==13){
            System.out.println("provide email ");
        }
        else {
            System.out.println("ineligible");
        }
    }
}

