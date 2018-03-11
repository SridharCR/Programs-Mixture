#include "stdio.h"
int main()
{
    char a[] = { 'A', 'B', 'C', 'D' };
    char* ppp = &a[0];
    //printf("%c\n", );
    printf("%c %c %c ",*ppp++, *++ppp, --*ppp); // Line 2
}
