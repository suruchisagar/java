package Q5;

import Q5.pkg.Child1;

public class Parent {

    //access specifier
    public int a;
    private int b;
    protected int c;
    int d;

    //parametrized constructor

    //non-static constructor
    public Parent(String s){
        System.out.println("Parameterized constructor of parent called"+s);
    }

    //static block acts like static constructor
    static{
        System.out.println("Parent static block called");
    }

    //non-static block(runs before constructor)
    {
        System.out.println("Parent non-static block called");
    }

    public void proc1(){
        System.out.println("parent class proc1 method");
    };

    //factory method
    public static Q5.Parent get(String type) {
        switch (type.toLowerCase()) {
            case "child":
                return new Child();
            case "child1":
                return new Child1();
            default:
                return null;
        }
    }
}
