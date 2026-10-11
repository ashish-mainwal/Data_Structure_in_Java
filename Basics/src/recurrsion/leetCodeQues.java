package recurrsion;

public class leetCodeQues {
    public static void main(String[] args){
        System.out.println("the total steps are: " + Ans(214,0));
    }
    static int Ans(int num , int count){
        if(num==0){
            return count;
        }

        if(num%2==0){
            return Ans(num/2 , ++count);
        }
        else{
         return Ans(num-1,++count);
        }
    }
}
