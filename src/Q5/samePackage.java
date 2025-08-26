package Q5;

public class samePackage {
    public void accessVars() {
        Parent p= new Parent("parent object is created in another class of same package");
        System.out.println("Accessing variables of parent class from same package");
        System.out.println("accessing public variable: " +p.a);

        //private members are not accessible
//        System.out.println("accessing public variable: " +p.b);   //error
        System.out.println("accessing protected variable: " +p.c);   //error
        System.out.println("accessing default variable: " +p.d);   //error
    }
}
