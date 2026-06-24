package array;

import java.util.Arrays;

public class binarySearchIn2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int target = 4 ;
        System.out.println(Arrays.toString(efSearch(arr, target)));
    }

    static int[] Bsearch(int[][] arr , int target ,int row, int cStart , int cEnd){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(arr[row][mid] == target){
                return new int[]{row,mid};
            }
            else if(arr[row][mid] > target){
                cEnd = mid - 1;
            }
            else{
                cStart = mid + 1;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] efSearch(int[][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;

        if(rows == 1){
            return Bsearch(arr, target,0,0,cols-1);
        }

        int rstart = 0;
        int rend = rows-1;
        int cmid = cols/2;

        while(rstart < (rend -1)){
            int mid = rstart + (rend - rstart)/2;

            if(arr[mid][cmid] == target){
                return new int[]{mid,cmid};
            }
            else if(arr[mid][cmid] > target){
                rend  = mid;
            }
            else{
                rstart = mid;
            }
        }

        if(arr[rstart][cmid] == target){
            return new int[]{rstart , cmid};
        }
        if(arr[rstart+1][cmid] == target){
            return new int[] {rstart+1,cmid};
        }
        if(arr[rstart][cmid-1] >= target){
            return Bsearch(arr,target,rstart,0,cmid-1);
        }
        if(target >= arr[rstart][cmid+1] && target <= arr[rstart][cols-1]){
            return Bsearch(arr,target,rstart,cmid+1,cols-1);
        }
        if(arr[rstart+1][cmid-1] >= target){
            return Bsearch(arr,target,rstart+1,0,cmid-1);
        }
        else{
            return Bsearch(arr,target,rstart+1,cmid+1,cols-1);
        }
    }
}
