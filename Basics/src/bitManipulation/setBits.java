package bitManipulation;

public class setBits {
    public static void main(String[] args) {
        System.out.println(SetBits(45));
    }

    static int SetBits(int n){
        int count = 0;
        while (n > 0){
            count++;
            n -= ( n & -n);
        }
        return count;
    }
}
