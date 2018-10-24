package Tester;

import org.springframework.stereotype.Component;

@Component("playPop")
public class Pop implements PlayList{

    @Override
    public String getName() {
        return "Pop";
    }
}
