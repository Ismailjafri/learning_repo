package Loop_Basic;

import java.util.Scanner;

public class Q27 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The No. To Check Strong Number: ");
        int n = input.nextInt();
        int sum=0;

        for (int i = n; i > 0 ; i=i/10) {
            int ld = i % 10;
            int fact = 1;
            for (int j = 1; j <= ld; j++) {
                fact = fact * j;
            }

            sum = sum + fact;
        }

        if(n==sum){
            System.out.print("It's Strong");
        }
        else{
            System.out.print("It's Not Strong");
        }
    }
}
