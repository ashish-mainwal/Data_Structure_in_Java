package bitManipulation;

import java.util.Arrays;

public class flippingAndReversingArray{
    public static void main(String[] args){
        int[][] arr = {
                {1,0,1},
                {0,0,1},
                {0,1,1}
        };
        for (int [] num : reverseAndFlip(arr)){
            System.out.println(Arrays.toString(num));
        }
    }

    static int[][] reverseAndFlip(int[][] arr){
        for(int[] num : arr){
            for(int i = 0 ; i< (num.length + 1)/2 ; i++){
                int temp = num[i]^1;
                num[i] = num[num.length -1 -i] ^ 1;
                num[num.length -1 -i] = temp;
            }
        }
        return arr;
    }
}