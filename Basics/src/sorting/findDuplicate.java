package sorting;

public class findDuplicate {
    public static void main(String[] args) {
        int[] arr= {3,5,2,1,4,2};
        System.out.println(findingDuplicate(arr));
    }
    static int findingDuplicate(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i+1){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
                    int temp = arr[correct];
                    arr[correct] = arr[i];
                    arr[i] = temp;
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1; // no duplicate
    }
}
