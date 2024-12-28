package Chapter9;

class TV {

    int channel = 1;

    int volumeLevel = 3;

    boolean on = false;



    public TV() {

    }



    public void turnOn() {

        on = true;

    }



    public void turnOff() {

        on = false;

    }



    public void setChannel(int newChannel) {

        if (on && newChannel >= 1 && newChannel <= 120) {

            channel = newChannel;

        }

    }



    public void setVolume(int newVolumeLevel) {

        if (on && newVolumeLevel >= 0 && newVolumeLevel <= 7) {

            volumeLevel = newVolumeLevel;

        }

    }



    public void channelUp() {

        if (on) {

            channel = (channel < 120) ? channel + 1 : 1;

        }

    }



    public void channelDown() {

        if (on) {

            channel = (channel > 1) ? channel - 1 : 120;

        }

    }



    public void volumeUp() {

        if (on && volumeLevel < 7) {

            volumeLevel++;

        }

    }



    public void volumeDown() {

        if (on && volumeLevel > 0) {

            volumeLevel--;

        }

    }

}



public class Test {

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