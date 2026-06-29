package bitManipulation;

public class findingRightMostSideSetBit {
    public static void main(String[] args) {
        int num = 20;
        System.out.println(findRightBit(20));
    }
    static int findRightBit(int num){
        return num & -num;
    }
}
