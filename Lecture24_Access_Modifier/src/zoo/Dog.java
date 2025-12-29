package zoo;

public class Dog extends Animal {

    public Dog(String name) {
        super(name, "Bark");
    }

    public void wagTail() {
        System.out.println(getName() + " wagging its tail");
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    protected void changeSound(String newSound) {
        changeSound(newSound);
    }
}
