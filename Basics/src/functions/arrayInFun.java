package functions;

import java.util.Arrays;

public class arrayInFun {
    public static void main() {
        int[] arr = {2, 32, 42, 234, 2};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
        // pass by reference behaviour  , change is shown
    }
    static void change(int[] arr){
        arr[3] = 34;
    }
}
