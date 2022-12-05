public class FunctionExample {

    // 1. 리턴이 없는 void형 함수들

    static void printHello() {
        System.out.println("printHello() 함수가 실행되는 중입니다.");
    }

    static void newSector() {
        System.out.println("\n==============\n");
    }

    static void printInt(int a) {
        System.out.println(a + "를 출력합니다: printInt(int a) 내부");
    }

    static void printString(String s) {
        System.out.println("'" + s + "'를 출력합니다: printString(String s) 내부");
    }

    // 2. 리턴이 있는 함수들

    static int returnInt30() {
        System.out.println("30을 return합니다: returnInt30() 내부");
        return 30;
    }

    // 3. 입력과 리턴이 모두 있는 함수들

    static int sum(int a, int b) {
        System.out.println(a + "와 " + b + "를 더해 return합니다: sum(int a, int b) 내부");
        
        return a + b;
    }

    static int sumTwice(int a, int b) {
        // 함수 내부에서 다른 함수를 호출할 수 있습니다.
        return sum(a, b) + sum(a, b);
    }

    public static void main(String[] args) {
        
        newSector();
        // 1. 리턴이 없는 void형 함수들

        printHello();
        System.out.println("printHello() 함수가 끝났네요.");
        System.out.println();

        printInt(4);
        System.out.println();

        int intVar1 = 10;
        // 함수의 인자로 변수를 넣어줄 수 있습니다.
        printInt(intVar1);
        System.out.println();

        String stringVar1 = "hello";
        printString(stringVar1);



        newSector();
        // 2. 리턴이 있는 함수들

        /*
         * 리턴이 있는 함수 function()의 내부에는 항상 return 문이 있습니다.
         * return 뒤에 오는 값이 함수의 값이라고 생각하면 됩니다.
         * 
         * 바로 다음 예시에서, returnInt30()에는 return 30;이 적혀있습니다.
         * return 뒤에 오는 값이 30이므로 변수에 30이라는 값을 대입할 때 
         * returnInt30()은 30과 완전히 같은 표햔입니다.
         */

        // 리턴된 값을 변수에 대입할 수 있습니다.
        // 다음 예시에서 "returnInt30()" 은 "30"과 동일한 표현입니다. returnInt30()은 항상 30을 리턴하기 때문입니다.
        int intVar2 = returnInt30(); // int intVar2 = 30; 와 같은 표현입니다.
        System.out.println("intVar2: " + intVar2);

        newSector();
        // 3. 입력과 리턴이 모두 있는 함수들

        int intVar3 = sum(1, 2); // int intVar3 = 1 + 2; 와 동일한 표현입니다.
        System.out.println("intVar3: " + intVar3);
        System.out.println();

        int a = 1, b = 2;
        // 함수의 인자로 변수를 넣어줄 수 있습니다.
        intVar3 = sum(a, b);
        System.out.println("intVar3: " + intVar3);
        System.out.println();

        // 함수의 결과값을 다른 함수의 인자로 줄 수도 있습니다.
        System.out.println("sum(1, 2): " + sum(1, 2) + ", 1 + 2: " + (1 + 2));
        System.out.println();

        // 다음 예시에서 sum(1, 2)가 먼저 3으로 리턴되고, sum(3, 3)의 값을 변수에 대입합니다.
        // 이때 구문의 실행 순서에 주의하세요. 괄호 안 쪽에 있는 함수가 먼저 실행됩니다!
        int intVar4 = sum(sum(1, 2), 3); // int intVar4 = (1 + 2) + 3;
        System.out.println("intVar4: " + intVar4); // 출력은 6
        System.out.println();

        // 함수 내부에서 다른 함수를 호출할 수 있습니다.
        System.out.println("3 + 4 twice: " + sumTwice(3, 4));
    }
}
