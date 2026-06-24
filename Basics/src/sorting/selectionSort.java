package sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {32,12,45,11,0};
        System.out.println(Arrays.toString(sSort(arr)));
    }
    static int[] sSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int last = arr.length -i-1;
            int max = 0;
            for(int j = 0;j<=last;j++){
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
        return arr;
    }
}
