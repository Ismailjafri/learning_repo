package Loop_Basic;

import java.util.*;

public class Q8 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int a = input.nextInt();
        int sum=0;

        for (int i = 1; i <= a ; i++) {
            sum=sum+i;
        }

        System.out.printf("The sum of 1 to %d is %d%n", a, sum);
    }
}
