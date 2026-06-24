package sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {42,52,11,43,4};
        System.out.println(Arrays.toString(Bsort(arr)));
    }
    static int[] Bsort(int[] arr){
        for(int i = 0;i<arr.length -1 ;i++){
            boolean swapped = false;
            for(int j = 0;j<arr.length - i -1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
                }
            if(!swapped){
                break;
            }
            }
        return arr;
        }
    }
