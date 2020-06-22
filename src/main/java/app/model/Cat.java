package app.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("cat")
public class Cat extends Animal {
    @Override
    public String toString() {
        return "I'm a Cat!";
    }
}
