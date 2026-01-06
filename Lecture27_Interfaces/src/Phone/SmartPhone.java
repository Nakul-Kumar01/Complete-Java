package Phone;

public class SmartPhone implements MusicPlayer,Phone,Camera {


    @Override
    public void takePhoto() {
        System.out.println("taking photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("recording video...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop music...");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Make a call... " + number);
    }

    @Override
    public void endCall() {
        System.out.println("Ending the call...");
    }
}
