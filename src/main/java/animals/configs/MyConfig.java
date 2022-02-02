package animals.configs;

import animals.enities.Cat;
import animals.enities.Dog;
import animals.enities.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }

    @Bean
    public Dog getDog(){
        return new Dog();
    }

    @Bean("Kesha")
    public Parrot getParrot(){
        return new Parrot();
    }
}
