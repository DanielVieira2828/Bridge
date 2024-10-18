public class WithoutBridgeDemo {
    public static void main(String[] args) {
        SimpleTVWithoutBridge tv = new SimpleTVWithoutBridge();
        tv.turnOn();
        tv.setVolume(20);
        tv.mute();

        System.out.println();

        SimpleRadioWithoutBridge radio = new SimpleRadioWithoutBridge();
        radio.turnOn();
        radio.setVolume(15);
    }
}
