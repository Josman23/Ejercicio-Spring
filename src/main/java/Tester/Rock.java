package Tester;

import org.springframework.stereotype.Component;

@Component("tester")
public class Rock implements PlayList {

    @Override
    public String getName() {
        return "Rock";
    }
}
