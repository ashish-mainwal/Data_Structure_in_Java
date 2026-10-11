package recurrsion;

import java.util.ArrayList;

public class linearSearchRecurrsion {
    public static void main(String[] args){
        int[] arr = {2,1,4,12,56,8,56};
        int target = 56;
        System.out.println("is targeted element is in the array " + lsearch(arr,target,0));
        System.out.println("the element is present at : " + findIndex(arr,target,0));
        System.out.println("the element is present at : " + SearchFromlast(arr,target,arr.length-1));
        ArrayList<Integer> ans = StoreInList(arr,target,0,new ArrayList<>());

        System.out.println(ans);
    }
    static boolean lsearch(int[] arr, int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || lsearch(arr,target,index+1);
    }

    static int findIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr,target,index+1);
        }
    }

    static int SearchFromlast(int[] arr, int target , int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return SearchFromlast(arr,target,index-1);
        }
    }
    static ArrayList<Integer> StoreInList(int[] arr , int target , int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return StoreInList(arr, target, index+1,list);
    }
}


