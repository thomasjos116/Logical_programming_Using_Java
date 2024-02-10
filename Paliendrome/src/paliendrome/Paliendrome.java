
package paliendrome;
import java.util.Scanner;

public class Paliendrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = sc.nextInt();
        int rev =0;
        int M = N;
        while (N>0)
        {
            int r = N%10;
            rev = rev*10+r;
            N=N/10;
        }
        if (M == rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
        
    }
    
}
