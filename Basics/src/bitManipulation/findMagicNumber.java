package bitManipulation;
import java.util.Scanner;

public class findMagicNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
        System.out.print("the magic numebr is : " + magic(n));
    }

    static int magic(int n){
        int ans = 0 ;
        int base = 5;
        while(n > 0){
            int last = n&1;
            n = n>>1;
            ans += last * base;
            base = base*5;
        }
        return ans;
    }

}

