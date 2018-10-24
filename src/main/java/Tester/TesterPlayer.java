package Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterPlayer {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Tester tester= applicationContext.getBean("tester",Tester.class);

        Mp3Player mp3Player = applicationContext.getBean("testerMp3",Mp3Player.class);
        DvdPlayer dvdPlayer = applicationContext.getBean("testerDvd",DvdPlayer.class);
        BlueRayPlayer blueRayPlayer = applicationContext.getBean("testerBrp",BlueRayPlayer.class);
        SmartPhone smartPhone = applicationContext.getBean("testerSp",SmartPhone.class);

        Rock rock  = applicationContext.getBean("playRock",Rock.class);
        Pop pop  = applicationContext.getBean("playPop",Pop.class);
        Banda banda  = applicationContext.getBean("playBanda",Banda.class);

        mp3Player.setPlayList(rock);
        dvdPlayer.setPlayList(pop);
        blueRayPlayer.setPlayList(banda);
        smartPhone.setPlayList(rock);

        tester.setDevice(dvdPlayer);

        tester.test();

        /*

        Tester testerDvd = applicationContext.getBean("testerDvd",Tester.class);
        Tester testerMp3 = applicationContext.getBean("testerMp3",Tester.class);
        Tester testerBrp = applicationContext.getBean("testerBrp",Tester.class);
        Tester testerSp = applicationContext.getBean("testerSp",Tester.class);

        System.out.println("----- Reproductor de Dvd -----");
        testerDvd.test();
        System.out.println("----- Reproductor de Mp3-----");
        testerMp3.test();
        System.out.println("----- Reproductor de BlueRay -----");
        testerBrp.test();
        System.out.println("----- Reproductor de SmartPhone -----");
        testerSp.test();

        */
    }
}
