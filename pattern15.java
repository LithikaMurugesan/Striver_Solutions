import java.util.*;
public  class striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i =0;i<n;i++){
            for(char j='A';j<='A'+(n-i-1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}