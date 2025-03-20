package javalearning;

import java.util.Scanner;

public class Patterns {
    public static void main(String[]args) {
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//               Hallow Pattern
//
//        for (i = 1; i <= n; i++) {
//            for(j=1; j <=n; j++){
//                if (i == 1 || i == n || j == 1 || j == n){
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//              Output
//           input n =5;
//             *****
//             *   *
//             *   *
//             *   *
//             *****

//        int count = 1;
//        for(i=1; i<=n; i++){
//            for(j=1; j<=n; j++){
//                if(count<10){
//                    System.out.print("0");
//                }
//                System.out.print(count + " ");
//                count++;
//            }
//            System.out.println();
//        }
//
//                   OutPut
//                input = 10
//        01 02 03 04 05 06 07 08 09 10
//        11 12 13 14 15 16 17 18 19 20
//        21 22 23 24 25 26 27 28 29 30
//        31 32 33 34 35 36 37 38 39 40
//        41 42 43 44 45 46 47 48 49 50
//        51 52 53 54 55 56 57 58 59 60
//        61 62 63 64 65 66 67 68 69 70
//        71 72 73 74 75 76 77 78 79 80
//        81 82 83 84 85 86 87 88 89 90
//        91 92 93 94 95 96 97 98 99 100



//        for(i=1; i<=n; i++){
//            for(j=1; j<=n; j++){
//                if((i*j)<10){
//                    System.out.print("0");
//                }
//                System.out.print((i*j) + " ");
//
//            }
//            System.out.println();
//        }
//                      Output
//                    input n =5;
//
//                  01 02 03 04 05
//                  02 04 06 08 10
//                  03 06 09 12 15
//                  04 08 12 16 20
//                  05 10 15 20 25

    }
}

