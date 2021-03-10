/*
Linked List Implementation:
     New data node addition - void add()
     Printing the linked list - void printList()
     Driver code - void main()
*/

#include <stdio.h>
#include <stdlib.h>
struct node
{
     int data;
     struct node *next;
};
void printList(struct node *display)
{
     while (display != NULL)
     {
          printf("%d\t%p\n", display->data, display->next);
          display = display->next;
     }
}
void add(struct node *one, struct node *two)
{
     struct node *result = (struct node *)malloc(sizeof(struct node));
     while (one != NULL && two != NULL)
     {
          printf("%d\n", one->data + two->data);
          one = one->next;
          two = two->next;
     }
     if (one != NULL)
          while (one != NULL)
          {
               printf("%d\n", one->data);
               one = one->next;
          }
     if (two != NULL)
          while (two != NULL)
          {
               printf("%d\n", two->data);
               two = two->next;
          }
}
int main(int argc, char const *argv[])
{
     struct node *one1 = (struct node *)malloc(sizeof(struct node));
     struct node *one2 = (struct node *)malloc(sizeof(struct node));
     one1->data = 5;
     one1->next = one2;
     one2->data = 4;
     one2->next = NULL;
     struct node *two1 = (struct node *)malloc(sizeof(struct node));
     struct node *two2 = (struct node *)malloc(sizeof(struct node));
     struct node *two3 = (struct node *)malloc(sizeof(struct node));
     two1->data = 5;
     two1->next = two2;
     two2->data = 4;
     two2->next = two3;
     two3->data = 3;
     two3->next = NULL;
     //printList(one1);
     printf("\n");
     add(one1, two1);
     //printList(two1);
     return 0;
}
