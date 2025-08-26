package Q5.pkg;

import Q5.Parent;

public class Child1 extends Parent {
    //constructor
    public Child1() {
        super("Child 1 constructor called");
    }

    //    @Override
//    public void proc1(){
//        System.out.println("procl() function of Child1 class");
//    }
    public void proc1(String s, int i){
        System.out.println("procl() function of Child1 class");
    }

    @Override
    public void proc1() {
        System.out.println("proc1() method in child 1 is created to remove the error");
    }
    public void accessvarChild1(){
        System.out.println("Child1 access public var"+a);
        System.out.println("Child1 access protected var"+c);

        //this shows error because private var and default var are not accessible
//        System.out.println("Child1 accesss private var"+b);    //error
//        System.out.println("Child1 access default var"+d);     //error
    }

    //creating an object of parent in child1 and accessing through that
    public void accessVarsWithParentObj() {
        Parent p = new Parent("parent obj created");
        System.out.println("Child1 accessing publicVar via Parent obj: " + p.a);
    }
}
