package Loop_Basic;

import java.util.*;
public class Q2 {
    public static void main(String args[]) {
        Scanner i = new Scanner(System.in);

        System.out.println("Enter Till What No You Want To Print: ");
        int a = i.nextInt();

        for (int j = 1; j <= a; j++) {
            System.out.println(j);
        }
    }
}
