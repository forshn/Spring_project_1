package animals.enities;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name = "Marsik";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
