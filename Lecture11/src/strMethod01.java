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

        String name = "Amar Panchal";
        String substring = name.substring(5);
        String substring2 = name.substring(5,8);  // last index will be excluded
        System.out.println(substring);
        System.out.println(substring2);

    }
}
