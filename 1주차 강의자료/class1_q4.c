#include <stdio.h>

int main(void)
{
    int n, m;

    n = 3;
    m = 7;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            if (j % 2 == 0)
                printf("Check: %d %d\n", i, j);

    return 0;
}



