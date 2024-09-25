package Loop_Basic;

import java.util.Scanner;

public class Q24 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = input.nextInt();

        System.out.print("Enter Second Number: ");
        int b = input.nextInt();

        int ans=1;

        for (int i = 1; i <= a && i <= b ; i++) {
            if(a%i==0 && b%i==0){
                ans = i;
            }
        }

        System.out.printf("The Greastest Common Factor Is : %d",ans);
    }
}
