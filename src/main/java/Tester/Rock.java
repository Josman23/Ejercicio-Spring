package Tester;

import org.springframework.stereotype.Component;

@Component("playRock")
public class Rock implements PlayList {

    @Override
    public String getName() {
        return "Rock";
    }
}
