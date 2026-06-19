package functions;

import java.util.Scanner;

public class fibo {
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of terms: ");
        int n = sc.nextInt();
        fibon(n);
    }
    static void fibon(int n){
        int a = 0;
        int b = 1;
        int c = a + b;
        for(int i = 0; i < n ; i++){
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
