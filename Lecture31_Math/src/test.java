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
        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(d));
        System.out.println(Math.round(d));
    }
}
