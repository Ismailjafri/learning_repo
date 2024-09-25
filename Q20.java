package Loop_Basic;

import java.util.Scanner;

public class Q20 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number :");
        int a = input.nextInt();

        int count = 0;
        for (int i = 2; i < a; i++) {
            if(a%i==0){
                count++;
            }
        }

        if(count==0){
            System.out.print("Its Prime");
        }
        else{
            System.out.print("Its Not Prime");
        }
    }
}
