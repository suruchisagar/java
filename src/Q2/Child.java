package Q2;

public class Child extends Parent{


    //non-static constructor
    Child(){
        super("hello from child");
        System.out.println("Child class constructor called");

    }
    //static block acts like static constructor
    static{
        System.out.println("Child static block called which acts like static constructor");
    }

    //non-static block(runs before constructor)
    {
        System.out.println("Child non-static block called which runs before constructor");
    }

    public void proc1(){
        System.out.println("proc1 method of child class called");
    }
}
