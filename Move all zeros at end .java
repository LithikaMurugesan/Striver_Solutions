
import java.util.*;
public class striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
      String[] str = s.split(" ");
      int[] arr = new int[str.length];
      for(int i =0;i<str.length;i++){
          arr[i]=Integer.parseInt(str[i]);
      }

        System.out.println(Arrays.toString(Rotate(arr)));
    }
    static int[] Rotate(int[] arr) {
        int [] temp= new int[arr.length];
        int idx =0;
for(int i=0;i<arr.length;i++) {
    if (arr[i] != 0) {
        temp[idx] = arr[i];
        idx++;
    }
}
    for(int i=0;i< arr.length;i++){
        arr [i]=temp[i];
    }

return arr;
    }
}