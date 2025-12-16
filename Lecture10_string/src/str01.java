public class str01 {
    public static void main(String[] args) {
        // string: sequence of characters
//        String name = "vipul";
//        System.out.println(name);


        // String is non-premetive datatypes , therefore variable mei refference store hoga (js mei string primitive datatype hai)
        // String ek class hai
        String address = new String("India"); // M-1  // since, String is a class
        String name = "vipul";  // M-2
        System.out.println(name);  // print krte vkt address nhi, value hi print hoti hai

        // what is the difference b/w these two methods??
        String x = "Ram";
        String a = new String("Ram");  // 'new' says: make a new object in Heap and return address of that memory
        String b = new String("Ram");
        String y = new String(x);
        System.out.println(a == b);  // gives false
        System.out.println(x == a);
        System.out.println(x == y);
        String c = "Ram";   // yaha bhi c and d address hi store kr rahe hn
        String d = "Ram";
        System.out.println(c == d);  // gives true
        System.out.println(x == c);




    }
}

/*

1. Two ways of creating a String
In Java, there are two main ways to create a String:

(a) Using string literals:
String x = "Ram";
String c = "Ram";
String d = "Ram";

These go into a special memory area called the String Pool (part of the heap).
If "Ram" already exists in the pool, Java reuses the same object, so x, c, and d point to the same memory location.

That’s why:
System.out.println(c == d); // true
System.out.println(x == c); // true


(b) Using new String():
String a = new String("Ram");
String b = new String("Ram");
String y = new String(x);


new always creates a new object in the heap, outside the string pool and return address of that memory.
So a, b, and y are different objects even if their content is the same.

That’s why:
System.out.println(a == b); // false
System.out.println(x == a); // false
System.out.println(x == y); // false


2. What is String Pool?
The String Pool is a special memory area inside the heap.
It stores only unique string literals.

Example:
String s1 = "Hello";
String s2 = "Hello";


Both s1 and s2 point to the same object in the pool.
If you create using new, the object is in the normal heap, not reused.
But you can force pool usage by calling:
String pooled = new String("Hello").intern();

*/
