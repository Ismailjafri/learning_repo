package Loop_Basic;

import java.util.*;

public class Q12 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Starting Point: ");
        int sp = input.nextInt();

        System.out.print("Enter The Ending Point: ");
        int ep = input.nextInt();

        int count=0;
        for (int i = sp; i < ep ; i++) {
           count++;
        }

        System.out.println(count-1);
    }

}
