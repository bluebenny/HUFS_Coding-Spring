#include <stdio.h>

int main(void) {
    int num = 0, current = 1000;
    char input = 0;

    current /= 2;

    printf("당신이 생각하는 숫자를 맞춰보겠습니다.\n");
    printf("1과 1000 사이의 숫자를 생각하십시오.\n");

    printf("\n");

    while(current != 0) {
        printf("당신이 생각하는 숫자가 %d보다 크거나 같습니까?(Y/N): ", num + current);
        scanf("%c", &input);
        getchar();

        if(input == 'Y') num += current;
        current = (current != 1) ? current / 2 + current % 2 : 0;
        // if(current == 1) current = 0;
        // else current = current / 2 + current % 2;
    }

    printf("\n당신이 생각한 숫자는 %d입니다", num);

    return 0;
}

