
package amstriongnumber;
import java.util.*;

public class AmstriongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =sc.nextInt();
        int r;
        int sum =0;
        int m = n;
        
        while(n>0)
        {
            r= n%10;
            n = n/10;
            sum = sum+r*r*r;
             
        }
        if (sum == m)
        {
            System.out.println("Amstrong");
            
        }
        else {
            System.out.println("not Amstrong");
        }
    }
    
}
