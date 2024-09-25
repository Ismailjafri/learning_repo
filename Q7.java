package Loop_Basic;

import java.util.*;
public class Q7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter An Alphabet: ");
        char a = input.next().charAt(0);

        for (char i = a; i >='a' ; i--) {
            System.out.println(i);
        }
    }
}
