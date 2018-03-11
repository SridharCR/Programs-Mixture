/*
Count the characters
Show Topic Tags          Zoho
Given a string S. The task is to count the characters that have ‘N’ number of occurrences. If a character appears consecutively it is counted as 1 occurrence.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a string S and a number N as input.

Output:
For each test case, print the count of characters in new line.

Constraints:
1<=T<=100
1<=|String length |<=104
1<=N<=103

Example:
Input:
2
abc 1
geeksforgeeks 2

Output:
3
4
*/
#include <stdio.h>
#include <string.h>
int main(int argc, char const *argv[]) {
     int t,i;
     scanf("%d",&t);
     //while(t--)
     //{
          char ip[20];
          int n,j,k,size,ans=0,count=0;
          gets(ip);
          scanf("%d",&n);
          size = 3;
          for(j=0;j<size;j++)
          {
               for(k=0;k<size;k++)
               {
                    if(ip[j] == ip[k])
                         count++;
               }
               if(count == n)
                    ans++;
          }
          printf("%d",count );
     //}

     return 0;
}
