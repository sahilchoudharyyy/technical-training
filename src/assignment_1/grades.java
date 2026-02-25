package assignment_1;

import java.util.Scanner;

public class grades {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks (0-100):");
        int marks= sc.nextInt();
        if (marks<0||marks>100){
            System.out.println("marks out range, please enter marks between 0-100");
        }else{
            int markgrade=marks/10;
            switch (markgrade){
                case 10:
                case 9:
                    System.out.println("the grade is A");
                    break;
                case 8:
                    System.out.println("th grade is B");
                    break;
                case 7:
                    System.out.println("the grade is C");
                    break;
                case 6:
                    System.out.println("the grade is D");
                    break;
                default:
                    System.out.println("the grade is F");
            }
        }
    }
}
