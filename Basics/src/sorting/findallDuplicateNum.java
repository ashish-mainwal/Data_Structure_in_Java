package sorting;

import java.util.ArrayList;
import java.util.List;

public class findallDuplicateNum {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,2,8,3,1};
        System.out.println(findingAllDuplicate(arr));
    }
    static List<Integer> findingAllDuplicate(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for(int j = 0;j<arr.length;j++){
            if(arr[j] != j+1){
                ans.add(arr[j]);
            }
        }
        return ans;
    }
}
