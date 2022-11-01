#include <stdio.h>

int main(void) {
    int a, b, c;
    char d[10];

    printf("Enter two integers: ");
    scanf("%d %d", &a, &b); // Enter: 1 2 3\n --> Buffer
    // Buffer: " 3"
    printf("Enter one more integer: ");
    scanf("%d", &c);
    // Buffer: (empty)

    printf("\n%d, %d, %d", a, b, c);

    return 0;
}