package Loop_Basic;

import java.util.*;

public class Q22 {
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

        if(a==reverseNo){
            System.out.print("It's Palindrome");
        }
        else{
            System.out.print("It's Not Palindrome");
        }
    }
}
