#include <stdio.h>
typedef struct keypad
{
     int key;
     char alpha;
     keypad *next;
};
void insert_last()
{
     int value;
     printf("Enter the value to be inserted\n");
     scanf("%d",&value );
     temp = head;
     create();
     new_node -> data = value;
     if(head == NULL)
     {
          head = new_node;
          return;
     }
     while (temp -> next != NULL)
          temp = temp -> next;
     temp -> next = new_node ;
     printList(head);
}
int main(int argc, char const *argv[]) {
     struct keypad *head;

     return 0;
}
