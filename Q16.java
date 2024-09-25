package Loop_Basic;

import java.util.*;

public class Q16 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Base: ");
        int b = input.nextInt();

        System.out.print("Enter The Power To The Base: ");
        int p = input.nextInt();

        int ans=1;

        for (int i = p; i >=1 ; i--) {
            ans=b*ans;
        }

        System.out.println(ans);
    }
}
