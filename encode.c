#include <stdio.h>
#include <string.h>
int main(int argc, char const *argv[]) {
     char *str = "AABBBCCD";
     int i,n,count = 0;
     n = strlen(str);

     for(i = 1; i < n; i++)
     {
          if(str[i-1] == str[i]){
               count++;
               printf("%d\n", count);}
          else
               count = 1;

     }
     printf("%d\n", count);
     return 0;
}
