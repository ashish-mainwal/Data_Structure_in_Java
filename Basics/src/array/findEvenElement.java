package array;

public class findEvenElement {
    public static void main(String[] args) {
        int[] arr = {32,34,23,4,421,43,243,12,4312,341,243,1243,132,412,4,123,412,34132,4,1234,12,3412,4,125,25,25};
        int result = searchEven(arr);
        System.out.println(result);
    }
    static int searchEven(int[] arr){
        int count = 0;
        for (int n : arr){
            if(isEven(n)){
                count ++;
            }
        }
        return count;
    }
    static boolean isEven(int n){
        return ((int)Math.log10(n) + 1) % 2 == 0;
    }
}
