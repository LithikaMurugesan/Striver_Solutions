
import java.util.*;
public  class striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       recursive(n);
    }
static void recursive ( int n ){
        if (n<1){
            return ;
        }
    System.out.println(n);
    recursive(n - 1);



}
}