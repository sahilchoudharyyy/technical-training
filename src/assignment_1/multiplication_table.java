package assignment_1;

import java.util.Scanner;

public class multiplication_table {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for which multiplication table is needed:");
        int num= sc.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(num + "x" + i + "=" + num*i);

        }
    }
}
