package functions;

import java.util.Scanner;

public class armstrong {
    static void main() {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        boolean result = arm(n);
        System.out.println(result);
    }
    static int count(int n){
        int digit = 0;
        while(n > 0){
            digit ++;
            n = n/10;
        }
        return digit;
    }

    static boolean arm(int n){
        int sum = 0;
        int digits = count(n);
        int alias = n;
        int rem;
        while(n>0){
            rem = n%10;
            sum = sum + (int)Math.pow(rem,digits);
            n = n/10;
        }
         return (sum == alias);
    }
}
