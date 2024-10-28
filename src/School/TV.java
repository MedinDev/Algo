package School;

// TV class
class TV {
    int channel = 1;        // Default channel is 1
    int volumeLevel = 3;    // Default volume level is 3
    boolean on = false;     // TV is off by default

    // Constructor
    public TV() {
        // Default constructor
    }

    // Turns the TV on
    public void turnOn() {
        on = true;
    }

    // Turns the TV off
    public void turnOff() {
        on = false;
    }

    // Sets the channel if the TV is on and within the 1-120 range
    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    // Sets the volume if the TV is on and within the 0-7 range
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 0 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }

    // Increases the channel by 1, wrapping around if it exceeds 120
    public void channelUp() {
        if (on) {
            channel = (channel < 120) ? channel + 1 : 1;
        }
    }

    // Decreases the channel by 1, wrapping around if it goes below 1
    public void channelDown() {
        if (on) {
            channel = (channel > 1) ? channel - 1 : 120;
        }
    }

    // Increases the volume by 1 if it is below the max level of 7
    public void volumeUp() {
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }
    }

    // Decreases the volume by 1 if it is above the min level of 0
    public void volumeDown() {
        if (on && volumeLevel > 0) {
            volumeLevel--;
        }
    }
}

