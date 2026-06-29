package bitManipulation;

public class findNoOfDigits {
    public static void main(String[] args) {
        int num1 = 5342;
        int num2 = 0b10010011;
        int base1 = 10;
        int base2 = 2;

        System.out.println("no of digits for base " + base1 + " is " + findDigits(num1,base1));
        System.out.println("no of digits for base " + base1 + " is " + findDigits(num2,base2));
    }

    static int findDigits(int num , int base){
        return (int)(Math.log(num) / Math.log(base) + 1);
    }
}
