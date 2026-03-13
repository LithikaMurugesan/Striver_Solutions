import java.util.*;
public class Learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n;
        int num = 0;
        while (n != 0){
            int digit = n % 10;
         num = num*10+digit;
        n = n / 10;
    }
        if(org==num){
            System.out.println("plaindrome");
            }else{
            System.out.println("Not a palindrome");
        }

    }
}
