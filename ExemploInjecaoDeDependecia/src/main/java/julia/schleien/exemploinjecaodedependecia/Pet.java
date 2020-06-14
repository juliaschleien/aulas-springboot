package julia.schleien.exemploinjecaodedependecia;

import julia.schleien.exemploinjecaodedependecia.interfaces.AnimalInterface;
import julia.schleien.exemploinjecaodedependecia.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
/**
 * @author Julia Schleien
 */
public class Pet {

    @Autowired
    @Qualifier("cat")
    private AnimalInterface animalInterface;

    public void execute() {
        animalInterface.comunicar();

    }
}

