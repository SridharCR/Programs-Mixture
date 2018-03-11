import java.util.*;
public class num_to_name
{
     public static void main(String args[])
     {
          Scanner in = new Scanner(System.in);
          String input = in.next();
          int p = input.length();
          char k[] = input.toCharArray();
          String ones[] = {"one","two","three","four","five","six","seven","eight","nine"};
          String tens1[] = {"eleven","twelwe","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
          String tens2[] = {"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
          char num[] = "123456789".toCharArray();

          for(int i = p-1;i >= 0; i++)
          {
               if(k[i] == num[i])
                    System.out.println(k[i]);

          }
     }
}
