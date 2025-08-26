package Q4;

import Q4.Child;
import Q4.Child1;

public abstract class Parent {
    //parametrized constructor

    //non-static constructor
    Parent(String s){
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

    public abstract void proc1();

    //factory method
    public static Parent get(String type) {
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
