import java.util.Scanner;

public class Second_주영 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      //System.out.println("숫자가 500보다 크거나 같나?");
      int a = scan.nextInt();
            
      /*if(a==0)
      {
         System.out.println("숫자가 250보다 크거나 같나?");
         if(a==0)
         {
            System.out.println("숫자가 125보다 크거나 같나?");
         }
         else if(a==1)
         {
            System.out.println("숫자가 375보다 크거나 같나?");
         }
      }
      else if(a==1)
      {
         System.out.println("숫자가 750보다 크거나 같나?");
      }*/
      for(int i=1000;i>0;)
      {
         if(a==0)
         {
            System.out.println("숫자가"+i/2+"크거나 같습니까?");
            break;
         }
         else if(a==1)
         {
            System.out.println("숫자가"+i+(i/2)+"크거나 같습니까");
            break;
         }
      }
   
   }
}