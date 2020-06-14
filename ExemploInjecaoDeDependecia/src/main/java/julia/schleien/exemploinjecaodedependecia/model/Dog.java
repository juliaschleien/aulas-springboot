package julia.schleien.exemploinjecaodedependecia.model;

import julia.schleien.exemploinjecaodedependecia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Julia Schleien
 */
@Component
@Primary
@Qualifier("dog")
public class Dog implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("Au au!");
    }
}
