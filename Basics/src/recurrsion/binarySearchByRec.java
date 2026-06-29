package recurrsion;

public class binarySearchByRec {
    public static void main(String[] args) {

        int[] arr = {12,42,55,43,90,110,150};
        int target = 110;
        System.out.println(bSearch(arr,0,arr.length-1,target));
    }
    static int bSearch(int[] arr , int start , int end , int target){
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start)/2;

        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return bSearch(arr,start,mid-1,target);
        }
        else{
            return bSearch(arr,mid+1,end,target);
        }

    }
}
