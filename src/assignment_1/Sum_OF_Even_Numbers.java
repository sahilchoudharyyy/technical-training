package assignment_1;

public class Sum_OF_Even_Numbers {
    static void main(String[] args) {
        int sum=0;
        int i=0;
        while (i<=100){
            sum+=i;
            i+=2;
        }
        System.out.println("the sum of numbers is:"+ sum);

    }
}
