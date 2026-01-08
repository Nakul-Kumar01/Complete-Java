import InnerClass.Car;

public class test {
    public static void main(String[] args) {

        /*
        ### Inner Classes:
           - 4 types - Member Inner Class , Static Nested Class , Local Inner Class , Anonymous Inner Class

           # Member Inner Class:
             - Inner Class which is also the member of the class( **therefore can access properties of class** for this reason only we are using this MIC , vrna class Engine me instance of Car pass krna hota bohot mhent hoti) // it is associated with instance of outer class
             - car hai 'safari' , then hmm 'safari' ka engine bhi create krenge // Car ke object se hmm Engine ko bhi access kr paenge


         */


        Car car = new Car("Safari");
        Car.Engine engine = car.new Engine(); // creating instance of member Inner class using instance of main class
        engine.start();
        engine.stop();
    }
}
