#include <stdio.h>
#include <string.h>
typedef union details
{
     int age;
     char name[20];

}detail;
typedef struct tickets
{
     char PNR[20];
     char berth;
     int berth_no;
     detail pass;
}ticket;
int main(int argc, char const *argv[]) {
     int option;
     while(1)
     {
          printf("1.Book Ticket\n2.Cancel Ticket\n3.Print All\n4.Print Availability\n5.Exit");
          scanf("%d\n", option);
          switch(option)
          {
               case 1:
                    book_ticket();
                    break;
               case 2:

                    break;
               case 3:

                    break;
               case 4:

                    break;
               case 5:default:
                    exit(0);
          }
     }
     return 0;
}
