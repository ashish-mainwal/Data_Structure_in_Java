package OOPs;

public class finalKeyword {

    static void main(String[] args) {
        final A obj = new A("ashish");

        // obj = new A("sayam"); with final keyword , you cannot re assign

        // garbage collector , free the space after program ends , now
        // for example

        A obj1;

        for(int i =0;i<10000000;i++){
            obj1 = new A("kunal");
        }
    }
}

class A{
    final String name;


    A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed"); // evertime it will run , when garbage collector delets the object
    }
}
