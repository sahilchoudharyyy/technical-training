package assignment_1;

import java.util.Scanner;

public class prime_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isprime=true;
        System.out.println("enter the number:");
        int num = sc.nextInt();
        if(num<=1){
            isprime = false;
        }else{
            for (int i =2;i<=num;i++){
                if(num%i==0){
                    isprime=false;
                }
            }
        }
        if(isprime){
            System.out.println("the given no is prime ");
        }
        else{
            System.out.println("the num is not prime");
        }
    }
}

