package assignment_1;

import java.util.Scanner;

public class Positive {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("the entered number is positive;");
        } else if (num == 0) {
            System.out.println("the number entered is 0");
        } else{
            System.out.println("the number is negative");
        }
    }
}
