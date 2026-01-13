import java.util.*;
public class striver {
    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split( " ");
        int[] nums = new int[str.length];
        for(int i =0;i<nums.length;i++){
            nums[i]= Integer.parseInt(str[i]);
        }
        System.out.println(consecutiveOne(nums));
    }
    static int consecutiveOne(int[]nums){
        int count =0;
        int max =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else {
                count=0;
            }
max = Math.max(count,max);
            }
        return max;
        }

    }
