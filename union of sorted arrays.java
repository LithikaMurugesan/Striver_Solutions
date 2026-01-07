import java.util.*;
public class striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        String [] str1 = s1.split(" ");
        int [] num1 = new int[str1.length];
        for(int i=0;i< num1.length;i++){
            num1[i]=Integer.parseInt(str1[i]);
        }
        String s2 = sc.nextLine();

        String [] str2 = s2.split(" ");
        int [] num2 = new int[str2.length];
        for(int i=0;i< str2.length;i++){
            num2[i]=Integer.parseInt(str2[i]);
        }


        System.out.println(Arrays.toString(linaerSearch(num1,num2)));
    }
    static int[] linaerSearch(int[]num1,int[]num2){
       ArrayList <Integer> result = new ArrayList<>();
          int i =0 , j=0;
          while(i<num1.length&&j<num2.length){
              if(num1[i]<num2[j]){
                  result.add(num1[i]);
                  i++;
              } else if (num1[i]>num2[j]) {
                  result.add(num2[j]);
                  j++;
              }else {
                  result.add(num1[i]);
                  i++;
                  j++;
              }
          }
          while(i<num1.length) {
              result.add(num1[i]);
              i++;
          }
          while(j<num2.length) {
              result.add(num2[j]);
              j++;
          }
          return result.stream().mapToInt(Integer::intValue).toArray();
            }

    }