#include <stdio.h>

int main(void)
{
    int x, a, b, c;
    double y;

    a = 3;
    b = 4;
    c = 5;

    x = a * b + c;
    printf("첫번째 출력: %d\n", x);

    x = a + b * c;
    printf("두번째 출력: %d\n", x);

    y = a / b;
    printf("세번째 출력: %f\n", y);

    return 0;
}