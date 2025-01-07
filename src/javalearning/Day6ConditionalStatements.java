package javalearning;

import java.util.Scanner;

public class Day6ConditionalStatements {
public static void main(String[] args) {

                             /// This is if statement
    int a = 5;
    int b = 2;
    if (a>b) {
        System.out.println("your right");
    }

    /// This is if else statement

    int i = 2;
    int j = 5;
    if(i>j){
        System.out.println("print if condition");
    }
    else {
        System.out.println("print else condition");
    }

    /// This is switch statement

int number = 4;
switch (number){
    case 1:
        System.out.println("Your number is 1");
        break;
    case 2:
        System.out.println("Your number is 2");
    case 3:
        System.out.println("Your number is 3");
        break;
    case 4:
        System.out.println("Your number is 4");
    default:
        System.out.println("Prints default");
}

    int num;
    System.out.println("Enter your number :");
    Scanner sc = new Scanner(System.in);
     num = sc.nextInt();
    switch (num){
        case 11:
            System.out.println("Your number is 11");
            break;
        case 12:
            System.out.println("Your number is 12");
            break;
        case 13:
            System.out.println("Your number is 13");
            break;
        default:
            System.out.println("Your given numbers are not considered as case vales");
    }
}
}