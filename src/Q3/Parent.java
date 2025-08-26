package Q3;

public class Parent {
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

    public void proc1(){
        System.out.println("proc1 method of parent class called");
    }

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

