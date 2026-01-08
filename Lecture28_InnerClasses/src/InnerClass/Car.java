package InnerClass;

public class Car {

    private String model;

    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

    // Inner Class
    class Engine{
        void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model + "Engine started");
            }
            else System.out.println(model + "Engine is already on");
        }

        void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model + "Engine stopped");
            }
            else System.out.println(model + "Engine is already off");
        }
    }
}
