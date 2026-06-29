package recurrsion;

import java.util.Scanner;

public class fiboByRecurrsion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the term you wanna find : ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo (n-2);
    }
}
