#include <stdio.h>
#include <string.h>
int main(int argc, char const *argv[]) {
     char *str = "AAABBBCCD";
     int n,count = 1;
     n = strlen(str);
     for(size_t i = 0; i < n; i++)
     {
          if(str[i] == str[i+1])
               count++;
          else
          {
               printf("%c%d\n",str[i],count );
               count = 1;
          }
     }
     return 0;
}
