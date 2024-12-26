package javalearning.JavaLearning;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
//        String krish = "Vamsi";
//                int value = krish.length();
//        System.out.println(value);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.trim());
//        System.out.println(name.substring(2,5));
        System.out.println(name.replace('i', 'k'));
        System.out.println(name.replace("ris", "N"));

    }
}