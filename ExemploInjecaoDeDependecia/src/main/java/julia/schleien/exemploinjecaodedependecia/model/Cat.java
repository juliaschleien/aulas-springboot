package julia.schleien.exemploinjecaodedependecia.model;

import julia.schleien.exemploinjecaodedependecia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Julia Schleien
 */
@Component
@Qualifier("cat")
public class Cat implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("Miau!");
    }
}
