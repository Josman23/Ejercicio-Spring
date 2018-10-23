package Tester;

public class TesterPlayer {

    public static void main(String[] args) {

        DvdPlayer dvd = new DvdPlayer();
        Mp3Player mp3 = new Mp3Player();
        BlueRayPlayer brp= new BlueRayPlayer();

        Tester test = new Tester();
        test.testDvd(dvd);
        System.out.println();
        test.testMp3(mp3);
        System.out.println();
        test.testBlueRay(brp);
    }
}
