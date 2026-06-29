package bitManipulation;

public class power {
    public static void main(String[] args) {
        int base = 3;
        int power = 10;

        System.out.println(result(base , power));
    }
    static int result(int base , int power){
        int ans = 1;
        while(power >  0) {
            if ((power & 1) != 0) {
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }

        return ans ;
    }
}
