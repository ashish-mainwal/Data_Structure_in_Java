package array;

import java.util.Arrays;
import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
    }
}