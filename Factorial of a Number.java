import java.util.*;
public  class striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursive(n));

    }
    static int recursive ( int n ){
        if(n==0){
            return 1;
        }
    return n*recursive(n-1);
}
}