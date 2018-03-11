#include <stdio.h>
int get_count(int n)
{
     int count = 0;
     while(n >= 0) {
          for (size_t i = n; i > 0; i=i/2) {
               if(i%2 == 1) count++;
          }
          n--;
     }
     return count;
}
int main(int argc, char const *argv[]) {
     int n;
     scanf("%d",&n);
     printf("%d\n",get_count(n));
     return 0;
}
