package bitManipulation;

public class setIthbit {
    static void main(String[] args) {
        int num = 20;
        int bit = 6;
        System.out.println(set(20,bit));
    }
    static int set(int num , int bit){
        return num | (1 << (bit-1));
    }
}

