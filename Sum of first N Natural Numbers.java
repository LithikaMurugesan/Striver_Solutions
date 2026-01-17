import java.util.*;
public  class striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       recursive(n);
    }
static void recursive ( int n ){
        int count = 0;
        if(n!=1){
            for(int i=1;i<=n;i++){
                count = count+i;
            }
        }
    System.out.println(count);


}
}