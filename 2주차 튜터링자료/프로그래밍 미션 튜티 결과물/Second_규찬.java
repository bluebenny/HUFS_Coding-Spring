import java.util.Scanner;

public class Second_규찬 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("당신이 생각하는 숫자를 맞춰보겠습니다.");
      System.out.println("1과 1000 사이의 숫자를 생각하십시오.");
      System.out.println("질문이 참이면 1, 거짓이면 0을 입력하십시오.");
      
      int num = 1, num2 = 1000, mid = 500;
      int tf;
      int one = 0;
      
      for(int i = 0 ; i<10 ; i++)
      {
         if(one==9)
         {
            System.out.print("당신이 생각하는 숫자가"+ mid +"보다 큽니까?");
            tf = scan.nextInt();
            if(tf==1)
            {
               mid += 1;
               break;
            }
            else if(tf==0)
            {
               break;
            }
         }
         
         System.out.print("당신이 생각하는 숫자가"+ mid +"보다 크거나 같습니까?");
         tf = scan.nextInt();
         
         if(tf==0)
         {
            num2 = mid;
            mid = (num+num2)/2;
         }
         else if(tf==1)
         {
            num = mid;
            mid = (num+num2)/2;
            one += 1;
         }
      }
      
      System.out.println("당신이 생각한 숫자는"+mid+"입니다.");

    }
}