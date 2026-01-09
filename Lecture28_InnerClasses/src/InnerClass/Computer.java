package InnerClass;

public class Computer {
    private String brand;

    private String model;

    private OperatingSys os;


    public static class USB{  // staic Inner class
        private String type;

        public USB(String type) {
            this.type = type;
        }

        void displayInfo(){
            System.out.println("USB Type: "+ type);
        }
    }


    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSys(osName);
    }

    public class OperatingSys{
        private String osName;

        public OperatingSys(String osName) {
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer Model: " + model +" ,OS: "+ osName);
        }
    }

    public OperatingSys getOs() {
        return os;
    }
}
