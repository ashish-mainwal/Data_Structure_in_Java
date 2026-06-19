package array;

public class orderAgnostic {
    public static void main(String[] args) {
        int[] arr = {10000,9000,8000,3000,1000,122,10,0,-12,-10000};
        System.out.println(finds(arr,-10000));
    }
    static int finds(int[] arr , int target){
        boolean isAsc = arr[0] < arr[arr.length-1];
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + end - start/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

