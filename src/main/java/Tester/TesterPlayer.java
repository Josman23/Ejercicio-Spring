package Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterPlayer {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
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
    }
}
