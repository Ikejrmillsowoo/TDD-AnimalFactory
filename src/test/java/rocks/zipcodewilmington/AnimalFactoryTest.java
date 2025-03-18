package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        //Given
        String expectedName = "Bobbie";
        Date expectedDate = new Date(2011, 11, 10);
        int expectedId = 100;
        Dog dog = new Dog(expectedName, expectedDate, expectedId);

        //when
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createCatTest() {
        //Given
        String expectedName = "Whisky";
        Date expectedDate = new Date(2010, 8, 5);
        int expectedId = 100;
        Cat cat = new Cat(expectedName, expectedDate, expectedId);

        //when
        String actualName = cat.getName();
        Date actualDate = cat.getBirthDate();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }
}
