#include <stdio.h>
int main(int argc, char const *argv[]) {
     int ma[3][3] = {1,2,3,4,5,6,7,8,9},i,n=3,m=3,j;

     i = n/2;j = m/2;
     while(j>=0){
          if(i==0 && j==0 )
               j++;
          if(j < 0)
               i--;
          printf("%d\t",ma[i][j]);
     j--;

     }
     /*
     printf("%d\t",ma[i-1][j-1]);
     printf("%d\t",ma[i-1][j]);
     printf("%d\t",ma[i-1][j+1]);
     printf("%d\t",ma[i][j+1]);
     printf("%d\t",ma[i+1][j+1]);
     printf("%d\t",ma[i+1][j]);
     printf("%d\t",ma[i+1][j-1]);*/
     return 0;
}
