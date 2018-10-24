package Tester;

public class SmartPhone implements Device{

    private PlayList playList;

    public void turnON(){
        System.out.println("Encender Reproductor");
    }
    public void play(){
        System.out.println("Reproduciendo con playlist " + playList.getName());
    }
    public void stop(){
        System.out.println("Detener");
    }
    public void turnOff(){
        System.out.println("Apagar Reproductor");
    }

    public void setPlayList(PlayList playList) {
        this.playList = playList;
    }
}
