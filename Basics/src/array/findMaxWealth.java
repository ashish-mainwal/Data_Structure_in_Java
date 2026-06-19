package array;
public class findMaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {24,113,131},
                {42,1,30000,1}
        };
        System.out.println(maxWealth(arr));
    }
    static int maxWealth(int[][] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0;j<arr[i].length;j++) {
                sum += arr[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
