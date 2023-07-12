package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`




    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        // Given
        String expectedName = "Name of Cat";
        Cat cat = new Cat(expectedName,new Date(),1);
        // When
        String actualName = cat.getName();
        // Then
        Assert.assertEquals(expectedName, actualName);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {

    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void intidTest() {

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test

        public void testInheritance() {
            Mammal p = new Cat("cat",new Date(),1);
            Assert.assertTrue(p instanceof Animal);
        }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test

        public void testInheritance2() {
            Mammal p = new Cat("cat",new Date(),2);
            Assert.assertTrue(p instanceof Mammal);
        }


}
