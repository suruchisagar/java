package Q5;

import Q5.pkg.diffPackage;

public class Main {
    public static void main(String[] args) {
        //testing same package access
        samePackage s= new samePackage();
        s.accessVars();

        //testing different package access
        diffPackage d= new diffPackage();
        d.accessVars();
    }
}
