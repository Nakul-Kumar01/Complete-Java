public class test {
    public static void main(String[] args) {
        /*
        in java java.lang package is automatically imported  // it has Math package
         */

        int a = 10;
        int b = 11;
        int max = Math.max(a, b);  // 1
        int min = Math.min(a, b);  // 2
        int c = -11;
        int abs = Math.abs(c);     // 3
        double d = 1.123;
        System.out.println(Math.ceil(d));  // 4
        System.out.println(Math.floor(d)); // 5
        System.out.println(Math.round(d)); // 6
        int e = 144;
        System.out.println(Math.sqrt(e)); // 7
        System.out.println(Math.pow(12,2)); // 8
        System.out.println(Math.log10(10)); // 9
        System.out.println(Math.PI);  // 10
        System.out.println(Math.E); // 11
        System.out.println(Math.random()); // 12
    }
}
