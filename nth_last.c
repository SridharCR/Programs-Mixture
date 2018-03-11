#include <stdio.h>
#include <stdlib.h>
struct node
{
     int data;
     struct node* next;
};
void printList(struct node* display)
{
     while(display!=NULL)
     {
          printf("%d\t%p\n",display -> data,display -> next );
          display = display -> next;
     }

}
int searchlast(struct node* head,int s)
{
     struct node* temp = head;
     int count=0,flag = 0;
     while(temp != NULL)
     {
          count++;
          if(temp -> data == s)
          {
               flag = count;
          }
          temp = temp -> next;
     }
     printf("\n%d\n",flag );
}
int main() {
     struct node* head = NULL;
     struct node* second = NULL;
     struct node* third = NULL;
     struct node* fourth = NULL;
     //Dynamic Memory allocation
     head  = (struct node*)malloc(sizeof(struct node));
     second = (struct node*)malloc(sizeof(struct node));
     third  = (struct node*)malloc(sizeof(struct node));
     fourth  = (struct node*)malloc(sizeof(struct node));
     //Assignment of data and address
     head -> data = 1;
     head -> next = second;
     second -> data = 2;
     second -> next = third;
     third -> data = 3;
     third -> next = fourth;
     fourth -> data = 2;
     fourth -> next = NULL;
     printList(head);
     searchlast(head,2);
     return 0;
}
