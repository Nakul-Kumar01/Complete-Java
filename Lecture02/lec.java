class lec{
   public static void main(String[] args){
     System.out.println("Hello world");
}
}

// first in cmd we give this lec.java file to java Compiler for compilation : javac lec.java
// it coverts this file in byteCode(.class file, platform Independent)
// now we give this lec.class file to jvm for interpretaion to convert in Machine Code: java lec (Platform dependent)

// Q1) what is 'java' in this command : it is used to instruct jvm
// Q2) why we not use extension .class after 'lec' : by convention jvm automatically adds .class after 'lec'. so if you explicitly add .class it will throw error


// jvm interpretes byteCode line by line ?? what does it mean??
// jvm perform 2 passes:
// 1st: group all instructions -> ki phale kon chalana uske baad kon chalana hai
// 2nd: then unn instruction ko line by line chalayega
// due to this Compiler is fast as compare to interpreter



// justin time compiler(jit)??
// present in JVM 
// if any block is called several times, then it is compiled by justin time compiler, now jvm will use that compiled code further


/*
We use the JVM instead of a pure compiler because:

Portability – Bytecode + JVM = “Write once, run anywhere.”

Security & Control – JVM can enforce memory safety, sandboxing, garbage collection.

Performance Balance – JVM starts with interpretation for flexibility, then uses JIT for speed.

👉 In short: A normal compiler gives speed, but JVM gives portability + security + near-native speed with JIT.

*/