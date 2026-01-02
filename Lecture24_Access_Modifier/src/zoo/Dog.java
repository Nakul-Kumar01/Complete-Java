package zoo;

public class Dog  extends Animal{
    String region ;

    public Dog(String name,String region) {
        super(name, "Bark");
        this.region = region;
        System.out.println(age);  // age is default and accessible in same package by inheritance and by object reference BOTH
    }

    public void wagTail() {
        System.out.println(getName() + " wagging its tail");
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    protected void changeSound(String newSound) {
        this.sound = newSound;
    }
}
