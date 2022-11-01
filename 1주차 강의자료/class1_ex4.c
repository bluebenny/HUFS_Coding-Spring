#include <stdio.h>

// 1주차: 반복문 읽기 -- 각 위치에서 변수의 값 파악하기

int main(void)
{
    int n, m;

    n = 3;
    m = 7;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            if (i % 2 == 0 && j % 2 != 0)
                printf("Check2: %d %d\n", i, j);

    return 0;
}