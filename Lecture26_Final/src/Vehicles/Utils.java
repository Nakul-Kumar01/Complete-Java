package Vehicles;

public class Utils {

//    public static final double PI = 3.14; // M-1 for initialisation
//    PI = 3.14;   // classes mei ye tho hota hi nhi hai(ya tho declare krte vkt initialise kro, ya fir constructor mei)

    // IMPORTANT:
    public static final double PI; // M-2  // *** Bhai ye ek hi barr create hoga oor Constant hoga isiliye constructor mei initialise nhi krr skte***
    // when we use both static and final together then constructor is not allowed for initialisation
    // if we try to initialise static final constraints in constructer then:-  ek hi barr create hua(since, static) and final se ek hi barr initialise hoga , now when user will create 2 object of class then ek hi field ko second time initialise krega // this violates the property of final keyword // therefore, intellJ isse allow hi nhi krta
    // when we use single keyword static or final anyOne then we can use Constructor for initialisation  // ye tho ho hi jaega
    // where static is used we can use static block
    static {
        PI = 3.14;
    }

//    public Utils(){
//        PI = 3.14;
//    }


}
