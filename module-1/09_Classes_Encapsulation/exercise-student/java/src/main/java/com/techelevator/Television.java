package com.techelevator;
// Attributes
public class Television {
private boolean isOn = false;
private int currentChannel = 3;
private int currentVolume = 2;

//methods
public boolean isOn() { return isOn;}
public int getCurrentChannel() {
    return currentChannel;
}

public int getCurrentVolume() { return currentVolume; }
public void turnOff() { this.isOn = false;}
public void turnOn() { this. isOn = true;}

public void changeChannel(int newChannel) {
    if( this.isOn ) {
        if( newChannel >= 3 && newChannel <= 18 ) {
            this.currentChannel = newChannel;
        }
    }
}
public void channelUp() {
    if( this.isOn ) {
        if (this.currentChannel == 18) {
            this.currentChannel = 3;
        } else {
            this.currentChannel++;
        }
    }
}
public void channelDown(){
    if( this.isOn) {
        if ( this.currentChannel == 3) {
            this.currentChannel = 18;
            }
            else {
                this.currentChannel -- ;
        }
    }
}
public void raiseVolume() {
    if(this.isOn){
    if(this.currentVolume < 10) {
        this.currentVolume++;
    }
    }
}

public void lowerVolume() {
    if(this.isOn){
        if(this.currentVolume > 0) {
            this.currentVolume --;
        }
    }
}







}
