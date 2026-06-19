package functions;
import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        boolean result = checking(n);
        if(result){
            System.out.print("yo, " + n + " is a prime number");
        }
        else{
            System.out.print("sorry fam , " + n + " is not a prime number");
        }
    }
    static boolean checking(int n){
        if(n == 1){
           return false;
        }
        int c = 2;
        while(c * c  <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}
