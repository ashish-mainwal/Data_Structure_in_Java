package bitManipulation;

import java.util.Scanner;

public class xorTOrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st range : "  );
        int a = sc.nextInt();
        System.out.print("enter 2nd range : ");
        int b = sc.nextInt();
        System.out.println("result is : "+ findExor(a,b));
    }

    static int generalExor(int l){
        int rem = l%4;

        if(rem == 0){
            return l;
        }
        else if(rem == 1){
            return 1;
        }
        else if(rem == 2){
            return l+1;
        }
        else{
            return 0;
        }
    }

    static int findExor(int a , int b){
        return generalExor(a-1) ^ generalExor(b);
    }
}
