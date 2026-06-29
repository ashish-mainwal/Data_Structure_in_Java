package bitManipulation;

public class ifNumIsPowerOfTwo {
    public static void main(String[] args) {
        int n = 1024;
        System.out.println(checkPower(n));
        System.out.print(secondApproach(54));
    }
    static boolean checkPower(int n){
        int counter = 0;
        while(n>0){
            if((n&1) !=0){
                counter++;
            }
            n = n >> 1;
        }
        return counter == 1;
    }
    static boolean secondApproach(int n){
        return ((n & (n-1)) == 0);
    }
}
