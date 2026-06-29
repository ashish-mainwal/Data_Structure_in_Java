package bitManipulation;

public class findUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,8,4};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int unique = 0;
        for(int i = 0 ;i<arr.length;i++){
            unique = unique^arr[i];
        }
        return unique;
    }
}
