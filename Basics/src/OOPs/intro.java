package OOPs;

public class intro{
    public static void main(String[] args){

        Student a = new Student();

        Student b = new Student(a);

        a.display();
        b.display();

    }
}

class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this(23,"default username",100);
    };

    Student(Student other){
        this.rno = other.rno;
        this.marks = other.marks;
        this.name = other.name;

        System.out.println("you just call the copy constructor with this one");
    }

    void display(){
        System.out.println("the name is : " + this.name + " and the roll no is : " + this.rno + " and the marks are : " + this.marks);
    }

    void greet(){
        System.out.println("welocme to this world");
    }

    Student(int rno , String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}