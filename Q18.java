package Loop_Basic;

import java.util.Scanner;

public class Q18 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int a = input.nextInt();

        int count = 0;
        for (int i = a; i > 0 ; i=i/10) {
            count++;
        }

        System.out.println(count);
    }
}
