package javalearning.JavaLearning;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
         age = sc.nextInt();
        if (age>56) {
            System.out.println("Your Experienced ");
        }
            else if(age>46) {
            System.out.println("Your Semi- Experienced");
        }
                else if(age>36){
                    System.out.println("Your Semi-semi- Experienced");
                }
                else{
                    System.out.println("Your not experienced");
                }
            }
        }



