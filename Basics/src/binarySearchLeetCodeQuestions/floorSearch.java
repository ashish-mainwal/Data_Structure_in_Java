package binarySearchLeetCodeQuestions;

public class floorSearch {
    public static void main(String[] args) {
        int[] arr = {3,4,13,42,110,121,150};
        System.out.println(floorSEarch(arr,50));
    }
    static int floorSEarch(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + end - start/2;
            if(arr[mid] == target){
                return mid;
            }

            if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return end;
    }
}
