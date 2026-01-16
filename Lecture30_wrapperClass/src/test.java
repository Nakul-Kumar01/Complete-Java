public class test {

    public static void main(String[] args) {

        /*
        Wrapper Classes
        - Java is object-oriented, but primitive types are not objects. // therefore we need wrapper classes and these classes are used with Collections (ArrayList, HashMap, etc.)
        - i.e. In Boolean class - has a single field whose type is boolean and In addition, this class provides many methods to object of type Boolean
        - since ye object store krte hn to can store 'null' but not possible in primitive type
         */

        int a = 1; // primitive datatypes // 'a' is variable here // stored in stack
//        a.  // koi property nhi aaegi
        Integer b = 1;   // here 'b' is object of Integer class // 1 is stored in heap , 'b' is storing refference // here this 1 get converted from primetive to wrapper class's object called AUTOBOXING
        a = b;  // AUTOUNBOXING
        boolean hasGraphicCard = true;
        Boolean isAdult = true;


        Float f = 1.2f;




        Integer x = null; // can store null
        System.out.println(Integer.max(2,4));
        String st = "456";
        System.out.println(Integer.valueOf(st));


        Integer p = 1;
        Integer q = 1;
        Integer r = 3;
        System.out.println(p==q); // ye bhi work krta hai
        System.out.println(p == r);
        System.out.println(p.equals(r) );  // since, these are objects therefore we can use this also
    }
}
