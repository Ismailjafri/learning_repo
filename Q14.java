package Loop_Basic;

import java.util.*;

public class Q14 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Starting Point: ");
        int sp = input.nextInt();

        System.out.print("Enter The Ending Point: ");
        int ep = input.nextInt();

        int sum=0;
        for (int i = sp; i <= ep ; i++) {
            if (i%2==0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
