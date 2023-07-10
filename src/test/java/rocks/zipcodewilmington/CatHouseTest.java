package rocks.zipcodewilmington;
import static org.junit.Assert.*;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;


import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void addCat(){
        //Given
        Cat cat=new Cat("cat1",new Date(),0);
        //When
        CatHouse.add(cat);
        //Then
        int actual = CatHouse.getNumberOfCats();
        int expected=1;
        assertEquals(expected,actual);
        CatHouse.clear();
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatById() {
        //Given
        Cat cat=new Cat("cat1",new Date(),1);
        //When
        CatHouse.add(cat);
        CatHouse.remove(1);
        //Then
        int expected=0;
        int actual = CatHouse.getNumberOfCats();
        assertEquals(expected,actual);
        CatHouse.clear();
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeCat() {
        //Given
        Cat cat=new Cat("cat1",new Date(),1);
        //When
        CatHouse.add(cat);
        CatHouse.remove(cat);
        //Then
        int expected=0;
        int actual = CatHouse.getNumberOfCats();
        assertEquals(expected,actual);
        CatHouse.clear();
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void CatById() {
        //Given
        Cat cat=new Cat("cat1",new Date(),1);
        //When
        CatHouse.add(cat);
        //Then
        Cat expected=cat;
        Cat actual = CatHouse.getCatById(1);
        assertEquals(expected,actual);
        CatHouse.clear();
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfCats(){
        //Given
        Cat cat=new Cat("cat1",new Date(),1);
        Cat cat2=new Cat("cat2",new Date(),1);
        Cat cat3=new Cat("cat3",new Date(),1);
        Cat cat4=new Cat("cat4",new Date(),1);
        //When
        CatHouse.add(cat);
        CatHouse.add(cat2);
        CatHouse.add(cat3);
        CatHouse.add(cat4);
        //Then
        int actual = CatHouse.getNumberOfCats();
        int expected=4;
        assertEquals(expected,actual);
        CatHouse.clear();
    }

}
