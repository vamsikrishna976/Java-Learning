package javalearning.JavaLearning;

public class Dsa1exersice {
    public static void main(String[] args) {
        int [] arr= {30,32,36,60,54};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            if(temp%3 == 0){
            count ++;
        }
        }
        System.out.println(count);
    }
}
