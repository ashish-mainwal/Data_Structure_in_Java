package functions;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        String a = "ashish";
        change(a);
        System.out.println(a);

        // remain un - effected
    }

    static void change(String a){
        a  = "kunal";
    }
}
