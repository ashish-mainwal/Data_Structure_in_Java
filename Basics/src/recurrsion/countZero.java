package recurrsion;

public class countZero {
    public static void main(String[] args){
        System.out.println("the number of zeroes are: " + countingZero(10042,0));
    }
    static int countingZero(int num,int count){
        if(num == 0){
            return count;
        }

        int rem = num % 10;

        if(rem == 0){
            return countingZero(num/10,++count);
        }
        else{
            return countingZero(num/10,count);
        }
    }
}
