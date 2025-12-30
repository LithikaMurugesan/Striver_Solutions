import java.util.*;
public class striver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int[] nums = new int[str.length];
        for(int i =0;i<str.length;i++){
            nums[i] = Integer.parseInt(str[i]);
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        System.out.println("The second largest element in the Array is: " + secondLargest);

    }
}
