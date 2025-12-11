public class print {
    public static void main(String[] args) {
        // print : only single argument is allowed
        System.out.print("nakul"+"hii" + 5); // treated as single string after concatination


        // println : only single argumnet is allowed , but also give new line
        System.out.println("nakul"+"hii" + 5);
        int a = 2;
        int b = 3;
        System.out.println(a + b); // after adding treated as single agrument
        System.out.println(a + ": " + (a+b)); // treated as single argument


        // printf : allow multiple argument // also not give new line
        String s = "Sum";
        System.out.printf("%s of %d and %d is %d",s,a,b,(a+b));
        // for character: %c
        // for float: %f
    }
}
