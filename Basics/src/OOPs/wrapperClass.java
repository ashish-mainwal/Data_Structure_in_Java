package OOPs;

import java.lang.classfile.attribute.InnerClassesAttribute;

public class wrapperClass {
    public static void main(String[] args) {
        Integer a = new Integer(23 );
        //now it is not a primitive , it is a object , and object have properites and funcctions

        Integer b = new Integer(12);

        swap(a,b);

        System.out.println(a + " + " + b);
        // integer class have many function;

        // final keyword , prevents the modification of variable

        final int d = 34;

        int e = 23; // immediatley throws error , that is why ,, swapping is also not possible even in objects


        System.out.println(a);

        // with final keyword , you can change the value in objects , but you cannot re assign that object
    }   // example : final student keshav = new student();
    // now you can do , keshav.name = "raghav" , allow , but cannot do , other_student = keshav;
    // and thus , the swapping needs re assigning , so not happen in java

    static void swap(Integer a , Integer b){
        Integer temp;
        temp = a;
        a = b;
        b = temp;
    }
}
