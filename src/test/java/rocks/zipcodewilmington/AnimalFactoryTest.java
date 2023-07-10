package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    @Test
    public void addDog(){
        //given
        Dog animal = AnimalFactory.createDog("doggo", new Date());
        // When
        DogHouse.add(animal);
        // Then
        int expected=1;
        int actual=DogHouse.getNumberOfDogs();
        assertEquals(expected,actual);
        DogHouse.clear();
    }
    @Test
    public void addCat(){
        //given
        Cat animal = AnimalFactory.createCat("Catto", new Date());
        // When
        CatHouse.add(animal);
        // Then
        int expected=1;
        int actual=CatHouse.getNumberOfCats();
        assertEquals(expected,actual);
        CatHouse.clear();
    }

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
