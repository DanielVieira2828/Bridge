package comPadrao;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl tvRemote = new AdvancedRemoteControl(tv);

        tvRemote.turnOn();
        tvRemote.setVolume(20);
        ((AdvancedRemoteControl) tvRemote).mute();  // Usando a funcionalidade avançada

        System.out.println();

        Device radio = new Radio();
        RemoteControl radioRemote = new RemoteControl(radio) {}; // Usando a versão básica do controle remoto

        radioRemote.turnOn();
        radioRemote.setVolume(15);
    }
}
