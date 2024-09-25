package Loop_Basic;

import java.util.*;

public class Q13 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Starting Point: ");
        int sp = input.nextInt();

        System.out.print("Enter The Ending Point: ");
        int ep = input.nextInt();

        int count=0;
        int sum=0;
        for (int i = sp; i <= ep ; i++) {
            sum = sum + i;
            count++;
        }

        System.out.printf("The Average Is: %d",sum/count);
    }
}
