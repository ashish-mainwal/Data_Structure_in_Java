package recurrsion;

public class checkArraySort {
    public static void main(String[] args){
        int[] arr = {1,2,3,12,5,6};
        System.out.println(checkSort(arr,0));
    }
    static boolean checkSort(int[] arr, int index) {
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && checkSort(arr, ++index);
    }
}
