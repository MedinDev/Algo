package School;

// Test class
public class Test1 {
    public static void main(String[] args) {
        TV tv1 = new TV();

        System.out.println("tv1's channel is " + tv1.channel);
        System.out.println("tv1's volume level is " + tv1.volumeLevel);
        System.out.println("tv1 is " + ((tv1.on) ? "on" : "off"));
        System.out.println();

        tv1.setChannel(120);
        tv1.channelUp();
        tv1.channelDown();
        System.out.println("tv1's channel is " + tv1.channel);

        tv1.setVolume(7);
        tv1.volumeUp();
        tv1.volumeDown();
        System.out.println("tv1's volume level is " + tv1.volumeLevel);
        System.out.println();

        tv1.turnOn();
        tv1.setChannel(120);
        System.out.println("tv1's channel is " + tv1.channel);

        tv1.setChannel(130);
        System.out.println("tv1's channel is " + tv1.channel);

        tv1.channelUp();
        System.out.println("tv1's channel is " + tv1.channel);

        tv1.channelDown();
        System.out.println("tv1's channel is " + tv1.channel);
        System.out.println();

        tv1.setVolume(6);
        System.out.println("tv1's volume level is " + tv1.volumeLevel);

        tv1.setVolume(10);
        System.out.println("tv1's volume level is " + tv1.volumeLevel);

        tv1.volumeUp();
        System.out.println("tv1's volume level is " + tv1.volumeLevel);

        tv1.volumeUp();
        System.out.println("tv1's volume level is " + tv1.volumeLevel);

        tv1.setVolume(1);
        System.out.println("tv1's volume level is " + tv1.volumeLevel);

        tv1.volumeDown();
        System.out.println("tv1's volume level is " + tv1.volumeLevel);

        tv1.volumeDown();
        System.out.println("tv1's volume level is " + tv1.volumeLevel);
        System.out.println();
    }
}
