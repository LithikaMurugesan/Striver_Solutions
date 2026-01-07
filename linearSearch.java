
import java.util.*;
public class striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String [] str = s.split(" ");
        int [] num = new int[str.length];
        for(int i=0;i< num.length;i++){
            num[i]=Integer.parseInt(str[i]);
        }

        System.out.println(linaerSearch(num,k));
    }
    static int linaerSearch(int[]num,int k){
        for(int i=0;i< num.length;i++){
            if(num[i]==k){
                return i;
            }
        }
return -1;
    }
}