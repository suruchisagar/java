package Q5.pkg;

import Q5.Parent;

public class diffPackage {
    public void accessVars() {
        Parent p = new Parent("parent obj created in another class of diff package ");
        System.out.println("different package class accessing publicVar of parent class: " + p.a);

        //private, protected and default members are not accessible

//            System.out.println("accessing public variable: " +p.b);   //error
//            System.out.println("accessing public variable: " +p.c);   //error
//            System.out.println("accessing public variable: " +p.d);   //error
    }
}
