public class SimpleTVWithoutBridge {
    private int volume = 0;

    public void turnOn() {
        System.out.println("Turning on the TV.");
    }

    public void turnOff() {
        System.out.println("Turning off the TV.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + this.volume);
    }

    public void mute() {
        System.out.println("Muting the TV.");
        this.volume = 0;
    }
}
