package sorting;
import java.util.ArrayList;
import java.util.List;

public class findAllDisappearNum {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println((missNum(arr)));;
    }
    static List<Integer> missNum(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != arr[arr[i] -1]){
                int temp = arr[arr[i]-1];
                arr[arr[i] -1] = arr[i];
                arr[i] = temp;
            }else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0;index < arr.length;index++){
            if(arr[index] != index + 1){
                ans.add(index+1);
            }
        }
        return ans;
    }
}
