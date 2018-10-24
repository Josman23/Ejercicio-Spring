package Tester;

import org.springframework.stereotype.Component;

@Component("tester")
public class Pop implements PlayList{

    @Override
    public String getName() {
        return "Pop";
    }
}
