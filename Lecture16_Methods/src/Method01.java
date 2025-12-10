public class Method01 {

    public static void main(String[] args) {
       int[] a = {3,3,3,3,48,10};
//        System.out.println(sumOfArray(a));

        System.out.println(sum(4,5,6,7));

//        System.out.println(upperFun("   nakul  "));

//        String s = "nakul";
//        System.out.println(upper(s));
//        System.out.println(s);
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

    private static int sum(int a,int b){
        return a+b;
    }
    private static int sum(int a,int b,int c){  // method overloading(same name, but different parameters)
        return a+b+c;
    }
    // signature include: method name + parameters
    public static int sum(int ...a){
        int sum =0;
        for(int i: a) sum+= i;

        return sum;
    }


    public static String upper(String str){
        return str.toUpperCase();
    }
}
