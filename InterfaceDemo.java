package com.vijayjiragal;

// Interface
interface RemoteController{
     void powerOn();
     void powerOff();
}

interface VolumeController{
    void increaseVolume();
    void decreaseVolume();
}

class SamsungRemote implements RemoteController, VolumeController {

    @Override
    public void powerOn() {
        System.out.println("Turns ON Samsung Devices!!");
    }

    @Override
    public void powerOff() {
        System.out.println("Turns OFF Samsung Devices!!");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increases volume on Samsung Devices");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Decreases volume on Samsung Devices");
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
        SamsungRemote myRemote = new SamsungRemote();
        myRemote.powerOn();
        myRemote.powerOff();
        myRemote.increaseVolume();
        myRemote.decreaseVolume();


    }
}
