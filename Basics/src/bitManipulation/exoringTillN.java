package bitManipulation;

import java.util.Scanner;

public class exoringTillN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
        int n = sc.nextInt();
        System.out.println("result is : " +getExor(n));
    }
    static int getExor(int n){
        int a = n % 4;
        if(a==0){
            return n;
        }
        else if(a==1){
            return 1;
        }
        else if(a==2){
            return a+1;
        }
        else{
            return 0;
        }
    }
}
