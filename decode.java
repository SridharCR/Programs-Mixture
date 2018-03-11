import java.util.*;
public class decode
{
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int arr[] = {1,2,9,0};
          int count = 0,pos = 0,n = arr.length,flag = 0;
          for(int i = 0; i < n; i++)
          {
               if(arr[i]>0 && arr[i]<27)
                    pos += 1;
               else
                    pos -= 1;
          }
          if(pos == n)
               count++;
          for(int i = 0; i < n-1; i++)
          {
               if(arr[i+1] == 0) continue;
               if(arr[i]*10 + arr[i+1] < 27 && arr[i]*10 + arr[i+1] >0)
               {
                    System.out.println(arr[i]+" + "+arr[i+1]);
                    count++;
               }
               //if(!(arr[i]*10 + arr[i+1] < 27 && arr[i]*10 + arr[i+1] >0))
               //     count--;

          }
          System.out.println(count);
     }
}
