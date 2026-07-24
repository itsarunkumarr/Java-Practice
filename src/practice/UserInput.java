package practice;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.print("Number is: ");
        int a = sc.nextInt();

        System.out.println("Number is: " + a);

        System.out.println("String are: ");
        String s = sc.nextLine();
        System.out.println(s);

    }

}