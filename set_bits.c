#include <stdio.h>
int get_count(int n)
{
     int count = 0;
     while(n) {
          n &= (n-1);
          count++;
     }
     return count;
}
int main(int argc, char const *argv[]) {
     int n;
     scanf("%d",&n);
     printf("%d\n",get_count(n));
     return 0;
}
