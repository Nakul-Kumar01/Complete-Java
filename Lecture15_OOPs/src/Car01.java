public class Car01 {

    private String color;   // data members
    private String brand;
    private String model;
    private int year;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

//    public void setYear(int year) {
//        this.year = year;
//    }

    public String getModel() {
        return model;
    }

//    public void setModel(String model) {
//        this.model = model;
//    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void accelerate(int increment){  // methods
        speed += increment;
    }

    public void brake(int decrement){
        speed -= decrement;
        if(speed <  0)
            speed =0;
    }


}

