package enumDemo;

public enum Day {
    Sunday,Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday;

    public void display(){
        System.out.println("Today is " + this.name()); // konse instance ne call kiya hai
    }
}
