package binarySearchLeetCodeQuestions;

import java.util.Scanner;

public class findInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter element you want to search : ");
        int target = sc.nextInt();
        System.out.print("tne element is at : " + findElementInMountain(arr,target));
    }

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int findElementInMountain(int[] arr, int target){
        int peak = findPeak(arr);
        int firstTry = orderAgnostic(arr,target,0,peak);
        if(firstTry==-1){
            return orderAgnostic(arr,target,peak+1,arr.length-1);
        }
        return firstTry;
    }

    static int orderAgnostic(int[] arr, int target,int start , int end){
        boolean isAsc = arr[start] <= arr[end];
        while(start<=end){
            int mid = start + (end - start)/2;


            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(arr[mid] > target){
                    end  = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(arr[mid] > target){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }

        }
        return -1;
    }
}
