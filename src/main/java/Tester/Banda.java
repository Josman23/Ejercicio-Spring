package Tester;

import org.springframework.stereotype.Component;

@Component("playBanda")
public class Banda implements PlayList {
    @Override
    public String getName() {
        return "Banda";
    }
}
