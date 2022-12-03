#include <stdio.h>

// 1. 출력이 없는 void형 함수들

void newSector() {
    printf("\n==============\n\n");
}

void printHello() {
    printf("printHello() 함수가 실행되는 중입니다.\n");
}

void printInt(int a) {
    printf("%d를 출력합니다: printInt(int a) 내부\n", a);
}

void printString(char* s) {
    printf("\'%s\'를 출력합니다: printString(char* s) 내부\n", s);
}

// 2. 출력이 있는 함수들

int returnInt30() {
    printf("30을 return합니다: returnInt30() 내부\n");
    return 30;
}

// 3. 입력과 출력이 모두 있는 함수들

int sum(int a, int b) {
    printf("%d와 %d를 더해 return합니다: sum(int a, int b) 내부\n", a, b);

    return a + b;
}

int sumTwice(int a, int b) {
    // 함수 내부에서 다른 함수를 호출할 수 있습니다.
    return sum(a, b) + sum(a, b);
}


// main 함수 위에서 사용할 함수를 정의해야 함.

void main() { // main 함수를 void로 선언할 수 있음

    newSector();
    // 1. 출력이 없는 void형 함수들
    
    printHello();
    printf("printHello() 함수가 끝났네요.\n");
    printf("\n");

    printInt(4);
    printf("\n");

    int intVar1 = 10;
    // 함수의 인자로 변수를 넣어줄 수 있습니다.
    printInt(intVar1);
    printf("\n");

    // charVar1 은 "hello"라는 정보를 담고있는 메모리의 시작 주소입니다.(포인터 변수)
    // char charVar[10]과 똑같이 다룰 수 있습니다. ex) charVar1[0] = 'h'
    char* charVar1 = "hello"; 
    // 문자열의 시작 주소를 인자로 전달합니다.
    printString(charVar1);
    


    newSector();
    // 2. 출력이 있는 함수들

    // 리턴된 값을 변수에 대입할 수 있습니다.
    // 다음 예시에서 "returnInt30()" 은 "30"과 동일한 표현입니다. returnInt30()은 항상 30을 리턴하기 때문입니다.
    int intVar2 = returnInt30(); // int intVar2 = 30;
    printf("intVar2: %d\n", intVar2);



    newSector();
    // 3. 입력과 출력이 모두 있는 함수들

    int intVar3 = sum(1, 2); // int intVar3 = 1 + 2; 와 동일한 표현입니다.
    printf("intVar3: %d\n\n", intVar3);

    int a = 1, b = 2;
    // 함수의 인자로 변수를 넣어줄 수 있습니다.
    intVar3 = sum(a, b);
    printf("intVar3: %d\n\n", intVar3);

    // 함수의 결과값을 다른 함수의 인자로 줄 수도 있습니다.
    printf("sum(1, 2): %d, 1 + 2 = %d\n", sum(1, 2), 1 + 2);

    // 다음 예시에서 sum(1, 2)가 먼저 3으로 리턴되고, sum(3, 3)의 값을 변수에 대입합니다.
    // 이때 구문의 실행 순서에 주의하세요. 안 쪽에 있는 함수가 먼저 실행됩니다!
    int intVar4 = sum(sum(1, 2), 3); // int intVar4 = (1 + 2) + 3;
    printf("intVar4: %d\n", intVar4); // 출력은 6
    printf("\n");

    // 함수 내부에서 다른 함수를 호출할 수 있습니다.
    printf("3 + 4 twice: %d\n", sumTwice(3, 4));
}