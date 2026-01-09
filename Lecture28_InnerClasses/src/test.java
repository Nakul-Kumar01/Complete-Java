import InnerClass.*;

public class test {
    public static void main(String[] args) {

        /*
        ### Inner Classes:
           - 4 types - Member Inner Class , Static Nested Class , Local Inner Class , Anonymous Inner Class

           # Member Inner Class:
             - Inner Class which is also the member of the class( **therefore can access properties of class** for this reason only we are using this MIC , vrna class Engine me instance of Car pass krna hota bohot mhent hoti) // it is associated with instance of outer class
             - car hai 'safari' , then hmm 'safari' ka engine bhi create krenge // Car ke object se hmm Engine ko bhi access kr paenge

           # Static Nested Class:
             - independent of outer class, not dependent on their instance
             - hmme pata hai dono alag chij hai(Computer and USB), bss hmmne group krdiya hai
             - kitne bhi computer banalo, USB tho ek hi rahegi
             - helps in memory Management, sari computer se related chij Computer class me hai

           # Anonymous Inner Class:
             - if you want to create object of Implementation class without creating Implementation class
             - if you want to create object for one time use

           # Local Inner Class:
             -
         */


        Car car = new Car("Safari");
        Car.Engine engine = car.new Engine(); // creating instance of member Inner class using instance of main class
        engine.start();
        engine.stop();

        // ### Static Nested Class
        Computer com = new Computer("HP","ABC", "xyz");
        com.getOs().displayInfo(); // method of member inner class
        Computer.USB usb = new Computer.USB("Type-C"); // initialising static Inner class

        // ### Anonymous Inner Class
        ShoppingCart sc = new ShoppingCart(150);
//        CreditCard cc = new CreditCard();
//        sc.processPayment(cc); // ek puri CreditCard class file banai then uska object yaha pass kiya

        sc.processPayment(new Payment() {  // hmne yahi Payment Interface ki implementation class ka object bana diya
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " using Credit Card.");
            }
        });


        // Local Inner Class:
        Hotel h1 = new Hotel("sunsine Hotel",10,5);
        h1.reserveRoom("Ankit",5);
        h1.reserveRoom("bhanu",1);
    }
}
