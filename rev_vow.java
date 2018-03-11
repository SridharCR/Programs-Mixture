/*
Given a string, reverse only the vowels present in it and print the resulting string.


Input: First line of the input file contains an integer T denoting the number of test cases. Then T test cases follow. Each test case has a single line containing a string.

Output: Corresponding to each test case, output the string with vowels reversed.

Example:

Input:
4
geeksforgeeks
practice
wannacry
ransomware

Output:
geeksforgeeks
prectica
wannacry
rensamwora
 */

import java.util.Scanner;
public class rev_vow
{
     public static void main(String[] args)
     {
          Scanner in = new Scanner(System.in);
          int t = in.nextInt();
          while(t > 0){
               String test = in.next();
               char arr[] = test.toCharArray();
               char vow[] = new char[arr.length];
               char v[] = {'a','e','i','o','u'};
               int k = 0,b,count = 0;
               for(int i = 0; i < arr.length; i++)
               {
                    for(int j = 0;j < 5;j++)
                    {
                         if(arr[i] == v[j])
                         {
                              vow[k++] = arr[i];
                              arr[i] = '1';
                              count++;
                         }
                    }
               }
               b = count-1;
               for( int i = 0;i < arr.length;i++)
               {
                    if(arr[i] == '1')
                    {
                         arr[i] = vow[b--];
                    }
               }
               System.out.println(arr);
               t--;
          }

     }
}
