#include <stdio.h>
#include <string.h>
int main(int argc, char const *argv[]) {
     int t;
     scanf("%d",&t);
     while(t--)
     {
          char ip[200],op[200];
          gets(ip);
          int i,j,n,m,k;
          n = strlen(ip);
          int flag[n];
          for(k = 0, m = 0; k < n; k++)
          {
               if(ip[k] == '.')
               {
                    flag[m] = k;
                    m++;
               }
          }
          for (i = 0; ip[i] ; i++)
          printf("%d\n",flag[i]);
     }
     return 0;
}
