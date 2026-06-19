package array;

import java.util.ArrayList;
import java.util.Scanner;

public class arlist {
    static void main(String[] args) {
        ArrayList <Integer> list  = new ArrayList<>(10);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i ++){
            int a = sc.nextInt();
            list.add(a);
        }

        System.out.println(list);
    }
}
