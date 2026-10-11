package recurrsion;

public class ques2 {
    public static void main(String[] args){
        System.out.println(sums(1234));
    }
    static int sums(int n){
        if(n==0){
            return 0;
        }
            return n%10 + sums(n / 10) ;

    }
}
