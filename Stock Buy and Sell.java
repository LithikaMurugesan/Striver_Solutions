import java.util.*;
public class striver{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
subArraySum(arr);
}
static void subArraySum(int [] arr){
    int minPrice=arr[0];
    int maxProfit=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<minPrice){
            minPrice=arr[i];
        }else{
            maxProfit=Math.max(maxProfit,arr[i]-minPrice);
        }

    }
    System.out.println(maxProfit);
}
}