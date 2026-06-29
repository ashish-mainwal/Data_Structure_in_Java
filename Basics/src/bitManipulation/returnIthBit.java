package bitManipulation;

import java.util.Scanner;

public class returnIthBit {
    public static void main(String[] args) {
        int num = 3;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the ith bit : ");
        int n = sc.nextInt();
        System.out.print(checkingBit(num,n));
    }
    static int checkingBit(int num,int n){
        return (num >> (n-1)) & 1;
    }
}
