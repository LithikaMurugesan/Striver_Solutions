import java.util.*;
public class striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        String[] str = s.split(" ");
        int[] nums = new int[str.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(str[i]);
        }
        System.out.println(missingNumber(nums,n));
    }
    static int missingNumber(int[]nums,int n){
        for(int i=1;i<nums.length;i++){
            boolean seen = false;
            for(int j=0;j<nums.length-1;j++) {

                if (nums[j] == i) {
                    seen = true;
                    break;
                }
            }
                if (!seen) {
                    return i;
                }

        }