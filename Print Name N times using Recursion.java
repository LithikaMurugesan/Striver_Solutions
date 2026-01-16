import java.util.*;
public  class striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       int n = sc.nextInt();
        System.out.println(recursive(s,n));
    }
static String recursive (String s , int n ){

        if(n==0){
            return " ";
        }
    return s + recursive(s,n-1) ;

}
}