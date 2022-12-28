#include <stdio.h>

int main() {
    int x=1, y=1000, z=0;
    z=(x+y)/2;
    char a=89;
    printf("당신이 생각하는 숫자를 맞춰보겠습니다.\n");
    printf("1과 1000 사이의 숫자를 생각하십시오.\n");
    printf("질문이 참이면 Y, 거짓이면 N을 입력하십시오.\n\n");
    
    for(; a==89||a==78||a==121||a==110;) //67은 y의 아스키 코드값
    {
        
        printf("당신이 생각하는 숫자가 %d보다 크거나 같습니까?(Y/N): \n", z);
        scanf(" %c", &a);
        if(a==89||a==121)
        {
            x=z;
            z=(x+y+1)/2;
            printf("%d %d %d\n",x,y,z);
        }
        else
        {
            y = z;
            z=(x+y)/2;
            a=89;
            printf("%d %d %d\n",x,y,z);
        }
        if (x == z)
        break;
    }
    printf("당신이 생각한 숫자는 %d입니다.", x);

    return 0;
}