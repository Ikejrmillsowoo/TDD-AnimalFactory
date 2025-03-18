package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void createDogTest(){
        //Given
        String expectedName = "jimmy";
        Date expectedDob = null;
        int expectedId = 111;

        Dog dog = new Dog(expectedName, expectedDob, expectedId);


        //When
        String actualName = dog.getName();
        Date actualDob = dog.getBirthDate();
        int actualId = dog.getId();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDob,actualDob);
        Assert.assertEquals(expectedId,actualId);
    }


    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        // Given
        String expectedName = "doggy";
        Date expectedDob = new Date(2010, Calendar.MAY, 10);
        int expectedId = 111;
        Dog dog = new Dog(expectedName, expectedDob, expectedId);
        String expected = "bark!";

        // When
        String actual = dog.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        //Given
        String expectedName = null;
        Date expectedDob = new Date(2010, Calendar.MAY,10);
        int expectedId = 111;

        Dog dog = new Dog(null, expectedDob, expectedId);
        dog.setBirthDate(expectedDob);


        //When
        Date actualDob = dog.getBirthDate();


        //Then
        Assert.assertEquals(expectedDob,actualDob);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        // Given
        String expectedName = "Scooby";
        Date expectedDob = new Date(2010, Calendar.MAY, 10);
        int expectedId = 111;
        Dog dog = new Dog(expectedName, expectedDob, expectedId);
        Food expectedFood = new Food();
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getsIsTest() {
        //Given
        String expectedName = null;
        Date expectedDob = new Date(2010, Calendar.MAY, 10);
        Integer expectedId = 111;

        Dog dog = new Dog(expectedName, expectedDob, expectedId);


        //When
        Integer actualId = dog.getId();


        //Then
        Assert.assertEquals(expectedId, actualId);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInstanceTest() {
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
