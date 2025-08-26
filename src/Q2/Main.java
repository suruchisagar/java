package Q2;

import Q2.Child;
import Q2.Parent;

public class Main {
    public static void main(String[] args) {
        Parent p= new Parent("hello world");
        Child c= new Child();


        //sequence in which initializer of two classes has been invoked
//        Parent static block called
//        Parent non-static block called
//        Parameterized constructor of parent calledhello
//        Child static block called which acts like static constructor
//        Parent non-static block called
//        Parameterized constructor of parent calledhello from child
//        Child non-static block called which runs before constructor
//        Child class constructor called
    }
}
