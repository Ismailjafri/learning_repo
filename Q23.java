package Loop_Basic;

import java.util.Scanner;

public class Q23 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Till What You Want To Print Fibonacci: ");
        int a = input.nextInt();

        int f1 = 0;
        int f2 = 1;
        int next = 0;

        while(next <= a){
            System.out.print(next);
            f1 = f2;
            f2 = next;
            next = f1+f2;
        }
    }
}
