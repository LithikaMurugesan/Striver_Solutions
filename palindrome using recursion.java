import java.util.*;
public class striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(palindrome(s,0,s.length()-1));
    }
   static boolean palindrome(String s , int left, int right){
        if(left>=right){
            return true ;
        }
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
          return palindrome(s,0,s.length()-1);
   }
}
