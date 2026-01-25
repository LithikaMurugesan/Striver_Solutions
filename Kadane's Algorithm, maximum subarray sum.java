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
    int currentSum=0;
    int maxSum=0;
    for(int i=0;i<arr.length;i++){
        currentSum=Math.max(arr[i],currentSum+arr[i]);
        maxSum=Math.max(currentSum,maxSum);

    }
    System.out.println(maxSum);
}
}