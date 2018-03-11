import java.util.Scanner;
public class encode {
static String encodesri(String str)
{
     String encoding = "";
     char str1[] = str.toCharArray();
     int count;
     for (int i = 0; i < str1.length - 1; i++)
     {
          count = 1;
          while (str1[i] == str1[i + 1]) {
               count++;
               i++;
          }
          encoding += count + str1[i];
     }
     return encoding;
}
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     String sri = in.next();
     System.out.println(encodesri(sri));

}
}
