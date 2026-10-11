package recurrsion;
import java.util.Scanner;
public class ques {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the number : ");
      int n = sc.nextInt();
      pr(n);
   }
   static void pr(int n ){
      if(n==0){
         return;
      }
      pr(n-1);
      System.out.println(n);
   }
}
