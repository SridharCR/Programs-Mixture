#include <stdio.h>
int main(int argc, char const *argv[]) {
     char a,b = 'A';
     scanf("%c", &a);
     int count = 2*(a-b)+1,i,j,k;
     for(i = 1; i <= count; i++)
     {
          if(i < a-b+2)
          for(j = b,k = i; j <= a && k > 0; j++, k--)
               printf("%c\t",j );
          else
          for(j = b,k = count-i+1; j <= a && k > 0; j++, k--)
               printf("%c\t",j );
          printf("\n");
     }
     return 0;
}
