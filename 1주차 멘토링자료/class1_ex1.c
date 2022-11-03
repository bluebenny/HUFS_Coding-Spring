#include <stdio.h>

// 1주차: 버퍼 개념에 관하여(1)

int main(void)
{
    char temp1;
    char temp2[100];
    char temp3[100];


    printf("세 단어 이상의 문장을 입력하세요: "); // Enter: nice to meet you\n --> Buffer
    temp1 = getchar();
    // Buffer: "ice to meet you\n"
    scanf("%s", temp2);
    // Buffer: " to meet you\n"
    gets(temp3);
    // Buffer: (empty)

    printf("getchar(): \'%c\'\n", temp1);
    printf("scanf    : \"%s\"\n", temp2);
    printf("gets     : \"%s\"\n", temp3);

    return 0;
}