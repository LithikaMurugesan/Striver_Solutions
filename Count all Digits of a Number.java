import java.util.*;
public class Learn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        if (temp == 0) {
        count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
         }
        }
        System.out.println(count);
    }

}
