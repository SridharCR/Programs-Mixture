#include <stdio.h>
void sort(int arr[])
{
     // The output character array that will have sorted arr
char output[strlen(arr)];

// Create a count array to store count of inidividul
// characters and initialize count array as 0
int count[RANGE + 1], i;
memset(count, 0, sizeof(count));

// Store count of each character
for(i = 0; arr[i]; ++i)
    ++count[arr[i]];

// Change count[i] so that count[i] now contains actual
// position of this character in output array
for (i = 1; i <= RANGE; ++i)
    count[i] += count[i-1];

// Build the output character array
for (i = 0; arr[i]; ++i)
{
    output[count[arr[i]]-1] = arr[i];
    --count[arr[i]];
}

// Copy the output array to arr, so that arr now
// contains sorted characters
for (i = 0; arr[i]; ++i)
    arr[i] = output[i];
}
int main(int argc, char const *argv[]) {
     int t = 1,b = 5,l = 10;
     int cap[] = {8,5,4,3,2};
     sort(cap);

     return 0;
}
