package recurrsion;

public class rev {
    public static void main(String[] args){
        System.out.println(reversing(1234,0));
    }
    static int reversing(int n,int num){
        if (n == 0){
        return num;

        }
        return  reversing(n/10,num*10 + n%10);
    }
    }
