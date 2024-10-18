public class SimpleRadioWithoutBridge {
    private int volume = 0;

    public void turnOn() {
        System.out.println("Turning on the Radio.");
    }

    public void turnOff() {
        System.out.println("Turning off the Radio.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume set to " + this.volume);
    }
}
