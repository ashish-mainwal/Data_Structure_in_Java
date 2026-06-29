package bitManipulation;

import java.util.Scanner;

public class checkEven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((evenCheck(3)));
    }
    static boolean evenCheck(int a){
        return (a&1) != 1;
    }
}
