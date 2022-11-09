#include <stdio.h>

int main(void)
{
    char sentence1[100];
    char sentence2[100];

    printf("문장을 입력해주세요: ");
    gets(sentence1);

    printf("문장을 입력해주세요: ");
    scanf("%s", sentence2);

    printf("\n");

    printf("첫번째 출력: ");
    puts(sentence1);

    printf("두번째 출력: ");
    puts(sentence2);

    return 0;
}




