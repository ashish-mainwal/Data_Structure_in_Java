package bitManipulation;
import java.util.Scanner;
public class sumOfPascalTriangleRow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row number : ");
        int n = sc.nextInt();
        System.out.println("sum of row "+ n +" is " + (1<<(n-1)));
    }
}
