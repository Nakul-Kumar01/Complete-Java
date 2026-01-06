package Animal;

public interface Animal {

    public static final int MAX_AGE = 150; // static constants  // all three are fadeout
    // ye static constant hai : so final means constant, static hai hi, public tho hai hi // therefore no need write these


    public abstract void eat();  // no need to write public abstract

    void sleep();

    public static void info(){   // static method
        System.out.println("This is an Animal interface");
    }

    default void run(){  // default method
        this.eat(); // this represents the current instance
        System.out.println("Animal is running");
    }
}
