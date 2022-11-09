import java.util.Scanner;

public class SecondOne {
    public static void main(String[] args) {      
        Scanner scan = new Scanner(System.in);

        int num = 0, current = 1000;
        int input = 0;

        current /= 2;

        System.out.println("당신이 생각하는 숫자를 맞춰보겠습니다.");
        System.out.println("1과 1000 사이의 숫자를 생각하십시오.");
        System.out.println("질문이 참이면 1, 거짓이면 0을 입력하십시오.");      

        System.out.println();

        while(current != 0) {
            System.out.print("당신이 생각하는 숫자가 " + (num + current) + "보다 크거나 같습니까?(1/0): ");
            input = scan.nextInt();

            if(input == 1) num += current;
            current = (current != 1) ? current / 2 + current % 2 : 0;
            // if(current == 1) current = 0;
            // else current = current / 2 + current % 2;
        }

        System.out.println();
        System.out.println("당신이 생각한 숫자는 " + num + "입니다.");
    }
}