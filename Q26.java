package Loop_Basic;

import java.util.Scanner;

public class Q26 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The No. To Check Armstrong: ");
        int n = input.nextInt();
        int count = 0;
        int ld;
        int sum=0;

        for (int i = n; i > 0 ; i=i/10) {
            count++;
        }

        System.out.println(count);
        for (int j = n; j > 0; j = j /10) {
            ld = j%10;
            int base = ld;
            for (int k = count; k > 1 ; k--) {
                base=base*ld;
            }

            sum=sum+base;

        }


        if(sum==n){
            System.out.print("It's An Armstrong");
        }
        else{
            System.out.print("It's Not An Armstrong");
        }


    }
}
