package Loop_Basic;

import java.util.*;

public class Q11 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Starting Point: ");
        int sp = input.nextInt();

        System.out.print("Enter The Ending Point: ");
        int ep = input.nextInt();

        for (int i = sp; i <= ep ; i++) {
            if(i%2 != 0) {
                System.out.println(i);
            }
            else {
                continue;
            }
        }
    }

}
