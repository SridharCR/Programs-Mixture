import java.util.Scanner;
public class rotate {
     public static void main(String[] args) {
     char ip1[] = "sridhar".toCharArray();
     char ip2[] = "idharsr".toCharArray();
     //while(ip1 != ip2)
     int n = ip1.length,temp;
     for (int i = ;i < 1;i++ ) {

          if(i == 0)
          {
               temp = n - 1 - i;
               ip1[temp] = ip1[i];
          }
          else
          {
               temp = i - 1;
               ip1[temp] = ip1[i];
          }
     }
     System.out.println(ip1);
     }
}
