package Loop_Basic;

import java.util.*;
public class Q4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Which No You Want To Print 100 Times :- ");
        int a = input.nextInt();

        for (int i = 1; i <= 100 ; i++) {
            System.out.println(a);
        }
    }
}
