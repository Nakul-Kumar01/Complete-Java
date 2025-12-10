public class BoilerPlate {

    public static void main(String[] args) {
        //String[] args : for command line argument
        // public so that jvm can access main function by BoilerPlate.main
        // jvm not need of object to use this method , since it is instance of class , due to static // with the help of class
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
