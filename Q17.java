package Loop_Basic;

import java.util.*;

public class Q17 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int a = input.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d x %d = %d\n",a,i,a*i);
        }

    }
}
