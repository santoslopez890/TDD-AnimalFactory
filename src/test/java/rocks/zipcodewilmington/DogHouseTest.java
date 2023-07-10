package rocks.zipcodewilmington;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
        DogHouse.clear();
    }
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDog(){
        //Given
        Dog dog=new Dog("Dog1",new Date(),1);
        //When
        DogHouse.add(dog);
        //Then
        int actual = DogHouse.getNumberOfDogs();
        int expected=1;
        assertEquals(expected,actual);
        DogHouse.clear();
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
     public void removeById() {
        //Given
        Dog dog=new Dog("Dog1",new Date(),1);
        //When
        DogHouse.add(dog);
        DogHouse.remove(1);
        //Then
        int expected=0;
        int actual = DogHouse.getNumberOfDogs();
        assertEquals(expected,actual);
        DogHouse.clear();
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removedog() {
        //Given
        Dog dog=new Dog("Dog1",new Date(),1);
        //When
        DogHouse.add(dog);
        DogHouse.remove(dog);
        //Then
        int expected=0;
        int actual = DogHouse.getNumberOfDogs();
        assertEquals(expected,actual);
        DogHouse.clear();
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void dogById() {
        //Given
        Dog dog=new Dog("Dog1",new Date(),1);
        //When
        DogHouse.add(dog);
        //Then
        Dog expected=dog;
        Dog actual = DogHouse.getDogById(1);
        assertEquals(expected,actual);
        DogHouse.clear();
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogs(){
        //Given
        Dog dog=new Dog("Dog1",new Date(),1);
        Dog dog2=new Dog("Dog2",new Date(),2);
        Dog dog3=new Dog("Dog3",new Date(),3);
        Dog dog4=new Dog("Dog4",new Date(),4);
        //When
        DogHouse.add(dog);
        DogHouse.add(dog2);
        DogHouse.add(dog3);
        DogHouse.add(dog4);
        //Then
        int actual = DogHouse.getNumberOfDogs();
        int expected=4;
        assertEquals(expected,actual);
        DogHouse.clear();
    }
    }

