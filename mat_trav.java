import java.util.Scanner;
class mat_trav
{
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int ma[][] = new int[][]{{5,6,15,16,25},{4,7,14,17,24},{3,8,13,18,23},{2,9,12,19,22},{1,10,11,20,21}};
          int m = ma.length,count = 0;
          //System.out.println(ma[4][0]);
          //int n =
          int ind1 = 4,ind2 = 0;
          while(count/10 <= 50)
          {
          if(j == 4)i++;
          for(int i = 4,j=0;i >= 0;i--)
          {
               System.out.println(ma[i][j]);
               if(i == 0)j++;
               count++;
          }
          for(int j = 0,i = 0;j < 5 && i < 5; i++)
          {
               if(i-1 < 0)j++;
               System.out.println(ma[i][j]);
               //if(i == 4)j++;
               count++;
          }
          }
     }
     }
