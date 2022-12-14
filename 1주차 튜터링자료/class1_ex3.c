#include <stdio.h>

// 1주차: 반복문 읽기 -- 반복문의 기능

int main(void)
{
    // --우리가 해야할 일--
    // 구구단을 2단부터 9단까지 출력한다.
    // *구구단 i단을 출력한다 = i에 1부터 9까지 곱하여 출력한다.

    printf("------------------\n");
    for(int i = 2; i < 10; i++) // '2단부터 9단까지'...1
    {
        // 남은 할 일: i단을 출력한다. = i에 1부터 9까지 곱하여 출력한다.
        for(int j = 1; j < 10; j++) // '1부터 9까지'...2
            printf("%d * %d = %d\n", i, j, i * j); // 'i에 곱하여 출력한다'...3
        printf("------------------\n");
    }
    // 1 2 3 을 조합해보면 "2단부터 9단까지 (1부터 9까지 i에 곱하여) 출력한다."

}