package Loop_Basic;

import java.util.*;

public class Q19 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number To Reverse: ");
        int a = input.nextInt();
        int ld;
        int reverseNo = 0;

        for (int i = a; i > 0 ; i=i/10) {
            ld = i%10;
            reverseNo = reverseNo*10 + ld;
        }

        System.out.println(reverseNo);
    }
}
