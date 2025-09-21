public class Method01 {

    public static void main(String[] args) {
       int[] a = {3,3,3,3,48,10};
        System.out.println(sumOfArray(a));

        System.out.println(upperFun("   nakul  "));
    }

    public static int sumOfArray(int[] arr){
        int res =0;
        for(int i: arr){
            res += i;
        }
        return res;
    }

    private static String upperFun(String str){
        return str.trim().toUpperCase();
    }
}
