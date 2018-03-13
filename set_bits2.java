import java.util.Scanner;
public class set_bits2
{
     static int countSetBits(int n)
     {
          int count = 0;double m = 0.0;
          for (int i = 0; i < n; i++) {
               for (int j = 0;j < 2;j++ ) {
                    m = Math.pow(2,j);
                    count = count + (int)Math.ceil(n/(double)m);
               }
          }
          return count;
     }
     public static void main(String[] args)
     {
          Scanner in = new Scanner(System.in);
          int n = in.nextInt();
          System.out.println(countSetBits(n));
     }
}
