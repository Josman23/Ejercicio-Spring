package Tester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("testerMp3")
public class Mp3Player implements Device {

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
