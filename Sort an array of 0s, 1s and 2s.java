import java.util.*;
public class striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        sort(arr);

    }

    static void sort(int[] arr) {
        int left = 0;
        int mid = 0;
        int right = arr.length - 1;
        while (mid <= right) {
            if (arr[mid] == 0) {
                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;
                left++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid]= arr[right];
                arr[right]=temp;
                right--;
            }


        }
        System.out.println(Arrays.toString(arr));
    }
}