package recurrsion;

public class factorial {
    public static void main(String[] args){
        int n = 12;
        System.out.println("the factorial of " + n + " is "+ fact(n));
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n * fact(n-1);
    }
}
