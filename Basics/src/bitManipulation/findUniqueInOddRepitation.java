package bitManipulation;

public class findUniqueInOddRepitation {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,7,7,8,7,8,8};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int result = 0;
        for(int i = 1;i<=32;i++){
            int bitCount = 0;
            for(int num : arr){
                if((num & (1<<(i-1))) != 0){
                    bitCount++;
                }
            }
            if(bitCount % 3 !=0){
                result = result | (1<<(i-1));
            }
        }
        return result;
    }
}
