package Tester;

public class DvdPlayer implements Device {

    public void turnON(){
        System.out.println("Encender Reproductor");
    }
    public void play(){
        System.out.println("Reproducir");
    }
    public void stop(){
        System.out.println("Detener");
    }
    public void turnOff(){
        System.out.println("Apagar Reproductor");
    }
}
