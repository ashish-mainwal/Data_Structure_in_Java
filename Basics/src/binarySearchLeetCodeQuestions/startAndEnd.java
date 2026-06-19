package binarySearchLeetCodeQuestions;

import java.util.Arrays;

public class startAndEnd {
    public static void main(String[] args) {
        int[] arr = {12,14,14,14,14,19,29,39};
        System.out.println(Arrays.toString((Find(arr,14))));
    }
    static int[] Find(int[] arr, int target){
        int[] ans = {-1,-1};
        int start = Search(arr,target,true);
        int end = Search(arr,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int Search(int arr[] , int target , boolean findingStart){
        int ans = -1;
        int start =0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                if(findingStart){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return ans;
    }
}
