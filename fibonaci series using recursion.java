import java.util.*;
public class striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        fab(0,1,n);
    }
   static void fab(int a ,int b,int n){
    if(n==0){
      return ;
    }
       System.out.print(a+" ");
       fab(b,a+b,n-1);
   }
}