package Loop_Basic;

import java.util.*;
public class Q3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter From Where You Want To Print");
        int a = input.nextInt();

        for (int i = a; i >=1 ; i--) {
            System.out.println(i);
        }
    }
}
