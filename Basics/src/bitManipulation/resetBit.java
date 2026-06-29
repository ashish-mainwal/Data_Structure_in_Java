package bitManipulation;

public class resetBit {
    public static void main(String[] args) {
        int num = 43;
        int bit = 4;

        System.out.println(reset(num,bit));
    }

    static int reset(int num , int bit ){
        return num & ~(1 <<(bit-1));
    }
}
