import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class equalstring {
    static String abbreviation(String a, String b) {
         System.out.println(a+"\n"+b);
         int c = a.length() - 1;
         String v = a.subString(c);
         if(a.length() < 0 || b.length() < 0)
               return "NO";
          //if(a.indexOf(a.length()-1) == b.indexOf(b.length()-1))
               //return abbreviation(a.subString(a.length()-2),b.subString(b.length()-2));
          return abbreviation(v,b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String a = in.next();
            String b = in.next();
            abbreviation(a, b);
            //String result = abbreviation(a, b);
            //System.out.println(result);
        }
        in.close();
    }
}
