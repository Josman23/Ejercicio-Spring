package Tester;

import org.springframework.stereotype.Component;

@Component("tester")
public class Tester {

    private Device device;

        public void test(){
        device.turnON();
        device.play();
        device.stop();
        device.turnOff();
        }

        public void setDevice(Device device) {
            this.device = device;
        }
}
