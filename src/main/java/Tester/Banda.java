package Tester;

import org.springframework.stereotype.Component;

@Component("tester")
public class Banda implements PlayList {
    @Override
    public String getName() {
        return "Banda";
    }
}
