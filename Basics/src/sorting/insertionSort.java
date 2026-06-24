package sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {21,34,11,0,1};
        System.out.println(Arrays.toString(Isort(arr)));
    }
    static int[] Isort(int[] arr){
        for(int i = 0;i<arr.length -1;i++){
            for(int j = i+1 ; j>0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
}
