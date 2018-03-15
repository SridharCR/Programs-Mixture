import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class equalstring {

    static String abbreviation(String a, String b) {
         if(a.length() < 0 && b.length() < 0)
               return "NO";
          if(a.indexOf(0) == b.indexOf(b)) {
          return abbreviation(a.subString(),b.subString());
          }
          return abbreviation(a.subString(),b);
        /*String c = a.toUpperCase();
        int count = 0;
        System.out.println(c);
        for (int i = 0;i < c.length(); i++) {
             for (int j = 0;j < b.length() ;j++ ) {
                  if(c.indexOf(i) == b.indexOf(j)) {
                       count++;

                  }
             }
        }
        System.out.println(c);
        return "YES";*/
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String a = in.next();
            String b = in.next();
            String result = abbreviation(a, b);
            System.out.println(result);
        }
        in.close();
    }
}
