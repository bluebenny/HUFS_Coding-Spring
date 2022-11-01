#include <stdio.h>

int main(void)
{
    int n, m;

    n = 5;
    for (int i = 0; i < n; i++)
    {
        printf("Check1: %d\n", i);
    }

    printf("\n-------------------------------------\n\n");

    n = 3;
    m = 7;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            if (j % 2 == 0)
                printf("Check2: %d %d\n", i, j);

    return 0;
}