package Loop_Basic;

import java.util.Scanner;

public class Q25 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int a = input.nextInt();

        while(a>=0){
            System.out.print("Enter Another Number : ");
            a = input.nextInt();
        }

        System.out.print("Found Negative Number & Loop Stopped!");
    }
}
