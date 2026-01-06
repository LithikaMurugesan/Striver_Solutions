
import java.util.*;
public class striver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] num =s.split(" ");
    int[] arr = new int[num.length];
    for(int i =0;i<num.length;i++){
        arr[i] = Integer.parseInt(num[i]);

    }
        Removeduplicate(arr);
    }
 static void Removeduplicate(int[] arr){
        HashSet<Integer>set = new HashSet<>();
        for(int res:arr){
            set.add(res);
        }
     System.out.println(set);
        }
}