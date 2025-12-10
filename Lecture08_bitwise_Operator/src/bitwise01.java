public class bitwise01 {
    public static void main(String[] args) {
        // ### Bitwise Operator:  apply on each bits ###
        // and &
        int a = 5 & 4;
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(a);

        // or |
        int b = 5 | 4;
        System.out.println(b);


        // xor ^
        // if different bits -> 1
        // if same bits -> 0
        int c = 5 ^ 4;
        System.out.println(c);


        // not ~  // applicabe on single operand also
        int d = ~5;
        System.out.println(Integer.toBinaryString(d));
        System.out.println(d);


        // left shift  <<
        int e = 5;
        System.out.println(Integer.toBinaryString(e));
        int f = e << 1;  // 5 * 2^1
        System.out.println(f);
        System.out.println(Integer.toBinaryString(f));


        // right shift or Signed Right Shift   >>
        int g = 5;
        System.out.println(Integer.toBinaryString(g));
        int h = g >> 1;   // 5 /2^1  // its flor value
        System.out.println(h);
        System.out.println(Integer.toBinaryString(h));


        // unsigned right shift >>>
        // Signed Right Shift (>>) : If the number is negative, it fills the left side with 1s. and if no. is +ve then fills leftmost bits with 0s
        // Unsigned Right Shift (>>>) : Always fills left side with 0s, even for negative numbers.
        int i = 5 >> 2;
        int j = 5 >>> 2;
        System.out.println(i);
        System.out.println(j);
        i = -5 >> 2;
        j = -5 >>> 2; // if leftmost bit is 0 then ans will be positive
        System.out.println(Integer.toBinaryString(-5));
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(j));
        System.out.println(i);
        System.out.println(j);
    }

}
