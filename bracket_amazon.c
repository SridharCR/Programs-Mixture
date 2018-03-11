//[Brackets in Matrix Chain Multiplication]
#include <stdio.h>
int main(int argc, char const *argv[]) {
     int t;
     scanf("%d", &t);
     while (t--) {
          int n,comp,j,min = 1000;
          scanf("%d", &n);
          int arr[n];
          for (size_t i = 0; i < n; i++) {
               scanf("%d", &arr[i]);
          }
          for (size_t i = 0; i < n; i++) {
               if(min > arr[i]) {
                    min = arr[i];
                    index = i;
               }
          }
          if(arr[index - 1] > arr[index + 1])

          printf("%d\n", min);
          //j = 1+64;
          //printf("(%c%c)\n", j,++j);

     }
     return 0;
}
