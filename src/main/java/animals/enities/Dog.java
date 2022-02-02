package animals.enities;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name = "Misha";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
