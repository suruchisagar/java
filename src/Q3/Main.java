package Q3;

public class Main {
    public static void main(String[] args) {
        //invoking factory method from main
        Parent p1 = Parent.get("Child");   // creates Child object
        Parent p2 = Parent.get("Child1");  // creates Child1 object
        // calling methods on the objects
        if (p1 != null) {
            p1.proc1();
        }

        if (p2 != null) {
            p2.proc1();
        }

        //creating child1 object in parent variable
        Parent p3= new Child1();
//        p3.proc1("hello",1);
        //getting error from above so typecasting it
        Child1 c3 = (Child1) p3;   // downcasting
        c3.proc1("hello", 1);

    }
}
