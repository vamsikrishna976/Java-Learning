package javalearning.JavaLearning;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age :");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("Your an adult");
                break;
            case 23:
                System.out.println("Your going to job");
                break;
            case 60:
                System.out.println("Your going to retired");
                break;
            default:
                System.out.println("Engoy your life");
        }
    }
}
