import java.util.*;
public class striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String[] str= s.split(" ");
       int [] arr = new int[str.length];

       for(int i=0;i<str.length;i++){
           arr[i]=Integer.parseInt(str[i]);
       }
        int target = sc.nextInt();
        twoSum(arr,target);

    }
  static void twoSum (int[]arr,int target){
         int n = arr.length;
        for(int i= 0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Yes");
                    return;
                }
            }
        }
      System.out.println("No");
  }
}
