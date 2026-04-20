import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int rev = 0;
        boolean isNegative = n<0;
        n = Math.abs(n);
        while(n>0){
            int digit = n%10;
             rev = rev*10+digit;
             n = n/10;

        }
        if(isNegative){
            rev = -rev;
        }
        System.out.print(rev);
    }
}
