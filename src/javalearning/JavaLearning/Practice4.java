package javalearning.JavaLearning;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics Marks :");
         m1 = sc.nextInt();
        System.out.println("Enter your Mathematics Marks :");
         m2 = sc.nextInt();
        System.out.println("Enter your Chemistry Marks :");
         m3 = sc.nextInt();
         float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your percentage is : " +avg);
        if(avg>40 && m1>33 && m2>33 && m3>33){
            System.out.println("Your promoted to next class");
        }
        else{
            System.out.println("Your not promoted to next class");
        }
    }
}
