package javalearning;

import java.util.Scanner;

public class Numberchecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = sc.nextInt();
        switch (number%2){
            case 0:
                System.out.println("Given number is even :");
                break;
            case 1:
                System.out.println("Given number is odd : ");
            break;
            default:
                System.out.println("your number is invalid ");
        }
        sc.close();
    }
}
