package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAddDog() {
        // Given
        DogHouse dogHouse = new DogHouse();
        Integer expectedId = 1;
        String expectedName = "Scooby";
        Date date = new Date(2010 , 5 ,5);
        Dog dog = new Dog(expectedName, date, expectedId);
//        DogHouse.add(dog);
//        DogHouse.add(dog);
        Integer expectedNumber = 2;

        // When
        Integer actualNumber = DogHouse.getNumberOfDogs();



        // Then
        Assert.assertEquals(expectedNumber, actualNumber);
    }
    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void testRemoveInteger(){
        // Given
        DogHouse dogHouse = new DogHouse();
        int expectedId = 1;
        String expectedName = "Scooby";
        Object date = new Date(2010 , 5 ,5);
        Dog dog = new Dog(expectedName, (Date) date, expectedId);
        DogHouse.add(dog);
        DogHouse.remove(dog);


        // When
        String actualName = dog.getName();
        Integer actualId = dog.getId();


        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
