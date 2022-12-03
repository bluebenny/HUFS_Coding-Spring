public class FunctionExample {

    static void newSector() {
        System.out.println("\n==============\n");
    }

    void methodSample() {
        System.out.println("methodSample");
    }

    public static void main(String[] args) {

        /*
         * Java에서는 '함수'라는 이름 대신 '메소드'라는 이름을 사용합니다.
         * 받아들이기 쉽게 함수라고 부르겠습니다.
         */ 

        
        /* 
         * Java에서 주의할 점은 함수를 정의하는 위치입니다.
         * 클래스 내부에 단순하게 void funtion1() {...}을 정의하면
         * 해당 클래스에 대한 객체를 만들어 함수를 funtion1을 사용해야 합니다.
         * 
         * 다른 방법으로는 static 함수를 정의하는 방법입니다.
         * static void funtion2() {...}를 정의하면
         * 함수가 정의되어있는 클래스 내부에서 자유롭게 사용할 수 있습니다.
         * 
         * 수업에서 클래스 개념을 배우지 않기 때문에
         * 교수님께서 가르쳐주신 대로 함수를 사용해야 합니다.
         * 
         * 현재 코드에서는 다른 클래스에 함수를 정의해서 사용합니다.
         */

        // FuncionExample 클래스에서 선언된 methodSample() 사용하기
        FunctionExample c = new FunctionExample();
        c.methodSample();


        // Functions 클래스에 함수를 모두 정의했기 때문에 Funcions 객체를 생성해야 합니다.
        Functions f = new Functions();
        
        // FunctionExample 내부에서 선언된 static 함수이고
        // 현재 코드의 위치가 FunctionExample 내부이기 때문에 간단하게 호출할 수 있습니다.
        newSector();
        // 1. 출력이 없는 void형 함수들

        f.printHello(); // 생성한 객체의 메소드를 실행합니다.
        System.out.println("printHello() 함수가 끝났네요.");
        System.out.println();

        f.printInt(4);
        System.out.println();

        int intVar1 = 10;
        // 함수의 인자로 변수를 넣어줄 수 있습니다.
        f.printInt(intVar1);
        System.out.println();

        String stringVar1 = "hello";
        f.printString(stringVar1);



        newSector();
        // 2. 출력이 있는 함수들

        // 리턴된 값을 변수에 대입할 수 있습니다.
        // 다음 예시에서 "f.returnInt30()" 은 "30"과 동일한 표현입니다. returnInt30()은 항상 30을 리턴하기 때문입니다.
        int intVar2 = f.returnInt30(); // int intVar2 = 30;
        System.out.println("intVar2: " + intVar2);

        newSector();
        // 3. 입력과 출력이 모두 있는 함수들

        int intVar3 = f.sum(1, 2); // int intVar3 = 1 + 2; 와 동일한 표현입니다.
        System.out.println("intVar3: " + intVar3);
        System.out.println();

        int a = 1, b = 2;
        // 함수의 인자로 변수를 넣어줄 수 있습니다.
        intVar3 = f.sum(a, b);
        System.out.println("intVar3: " + intVar3);
        System.out.println();

        // 함수의 결과값을 다른 함수의 인자로 줄 수도 있습니다.
        System.out.println("f.sum(1, 2): " + f.sum(1, 2) + ", 1 + 2: " + (1 + 2));
        System.out.println();

        // 다음 예시에서 sum(1, 2)가 먼저 3으로 리턴되고, sum(3, 3)의 값을 변수에 대입합니다.
        // 이때 구문의 실행 순서에 주의하세요. 안 쪽에 있는 함수가 먼저 실행됩니다!
        int intVar4 = f.sum(f.sum(1, 2), 3); // int intVar4 = (1 + 2) + 3;
        System.out.println("intVar4: " + intVar4); // 출력은 6
        System.out.println();

        // 함수 내부에서 다른 함수를 호출할 수 있습니다.
        System.out.println("3 + 4 twice: " + f.sumTwice(3, 4));
    }
}

class Functions {

    // 1. 출력이 없는 void형 함수들

    void printHello() {
        System.out.println("printHello() 함수가 실행되는 중입니다.");
    }

    void printInt(int a) {
        System.out.println(a + "를 출력합니다: printInt(int a) 내부");
    }

    void printString(String s) {
        System.out.println("'" + s + "'를 출력합니다: printString(String s) 내부");
    }

    // 2. 출력이 있는 함수들

    int returnInt30() {
        System.out.println("30을 return합니다: returnInt30() 내부");
        return 30;
    }

    // 3. 입력과 출력이 모두 있는 함수들

    int sum(int a, int b) {
        System.out.println(a + "와 " + b + "를 더해 return합니다: sum(int a, int b) 내부");
        
        return a + b;
    }

    int sumTwice(int a, int b) {
        // 함수 내부에서 다른 함수를 호출할 수 있습니다.
        return sum(a, b) + sum(a, b);
    }
}