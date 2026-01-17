import java.util.*;

public class striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] str = s.split(" ");
        int[] n = new int[str.length];

        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(str[i]);
        }

        recursive(n, 0, n.length - 1);
        System.out.println(Arrays.toString(n));
    }

    static void recursive(int[] n, int p1, int p2) {
        if (p1 >= p2) {
            return;
        }
        int temp = n[p1];
        n[p1] = n[p2];
        n[p2] = temp;
        recursive(n, p1 + 1, p2 - 1);
    }
}


