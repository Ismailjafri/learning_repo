package Loop_Basic;

import java.util.*;

public class Q9 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The No. To Get Factorial: ");
        int a = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact*i;
        }

        System.out.printf("The Factorial Of %d Is %d",a,fact);
    }
}
