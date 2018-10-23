package Tester;

public class Tester {

    public void testDvd(DvdPlayer dvd){
        System.out.println("------- Reproductor DVD -------");
        dvd.turnON();
        dvd.play();
        dvd.stop();
        dvd.turnOff();
    }

    public void testMp3(Mp3Player mp3){
        System.out.println("------- Reproductor Mp3 -------");
        mp3.turnON();
        mp3.play();
        mp3.stop();
        mp3.turnOff();
    }

    public void testBlueRay(BlueRayPlayer brp){
        System.out.println("------- Reproductor Blue Ray -------");
        brp.turnON();
        brp.play();
        brp.stop();
        brp.turnOff();
    }
}
