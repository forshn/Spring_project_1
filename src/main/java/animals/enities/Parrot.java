package animals.enities;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Kesha";

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
