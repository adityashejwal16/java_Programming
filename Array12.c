#include<stdio.h>


int main()
{
    int Arr[] = {2, 4, 6, 8, 10};
    int i = 0;

    for(i = 0; i < 5; i++)
    {
        Arr[i] = Arr[i] + 2;
    }

    for(i = 0;  i < 5;  i++)
    {
        printf("%d\n",Arr[i]);
    }

    return 0;
}