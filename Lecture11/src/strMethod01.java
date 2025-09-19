public class strMethod01 {
    public static void main(String[] args) {

        // ### String Methods ###
/*

        String name = "Akshit Sharma";
        int length = name.length();
        char c = name.charAt(5);

        String name2 = "Akshit sharma";
        System.out.println(name.equals(name2));  // js mei string primetive thi tho vaha == se check ho jata tha
        System.out.println(name.equalsIgnoreCase(name2));
*/

/*

        String str1 = "remote";
        String str2 = "car";
        System.out.println('r' + 0);
        System.out.println('c' + 0);
        int i = str1.compareTo(str2);
        System.out.println(i);
*/
/*

        String name = "Amar Panchal";
        String substring = name.substring(5);
        String substring2 = name.substring(5,8);  // last index will be excluded
        System.out.println(substring);
        System.out.println(substring2);
*/
/*

        String name = "  nakul  ";
        System.out.println(name.trim()); // new string return hogi // trim the left and right space of string
*/
/*

        String name = "Amar Panchal";
        String nameLowerCase = name.toLowerCase(); //return new string // since string is immutable
        System.out.println(nameLowerCase);

        String newName = name.replace("Panchal", "Sharma");
        System.out.println(newName);

        System.out.println(name.contains("Pan")); // 'Pan' is present in name
        System.out.println(name.startsWith("Am")); // is name starts with "Am"
        System.out.println(name.endsWith("al"));
*/
/*

        String str = "    ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
*/

/*

        int a = 10;
        String s = String.valueOf(a);  // integer is converted into string
        String formattedStr = String.format("My name is %s and I am %d years old.", "john", 25);
        // previously we are using methods with objects, but now we are accessing methods with String class, hence these methods are static methods
        System.out.println(s);
*/

        String name = "Amar Panchal";
        System.out.println(name.substring(2,8));
        System.out.println(name.subSequence(2,8));
    }
}
