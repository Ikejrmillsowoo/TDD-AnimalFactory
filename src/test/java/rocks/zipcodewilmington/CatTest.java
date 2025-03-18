package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    // TODO - Create tests for `void setName(String name)`

    @Test
    public void setNameTest(){
        //Given
        String expectedName = "jimmy";
        Date expectedDob = null;
        int expectedId = 111;

        Cat cat = new Cat(expectedName, expectedDob, expectedId);


        //When
        String actualName = cat.getName();
        Date actualDob = cat.getBirthDate();
        int actualId = cat.getId();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDob,actualDob);
        Assert.assertEquals(expectedId,actualId);
    }
    // TODO - Create tests for `speak`

    @Test
    public void testSpeak() {
        // Given
        String expectedName = "Kitty";
        Date expectedDob = new Date(2010, Calendar.MAY, 10);
        int expectedId = 111;
        Cat cat = new Cat(expectedName, expectedDob, expectedId);
        String expected = "meow!";

        // When
        String actual = cat.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    //TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDateTest(){
       //Given
        String expectedName = null;
        Date expectedDob = new Date(2010, Calendar.MAY,10);
        int expectedId = 111;

        Cat cat = new Cat(expectedName, expectedDob, expectedId);
        cat.setBirthDate(expectedDob);


        //When
        Date actualDob = cat.getBirthDate();


        //Then
       Assert.assertEquals(expectedDob,actualDob);
    }
    //Given


    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void testEat(){
        // Given
        String expectedName = "Kitty";
        Date expectedDob = new Date(2010, Calendar.MAY, 10);
        int expectedId = 111;
        Cat cat = new Cat(expectedName, expectedDob, expectedId);
        Food expectedFood = new Food();
    }
    // TODO - Create tests for `Integer getId()`

    @Test
    public void getsIsTest(){
        //Given
        String expectedName = null;
        Date expectedDob = new Date(2010, Calendar.MAY,10);
        Integer expectedId = 111;

        Cat cat = new Cat(expectedName, expectedDob, expectedId);



        //When
        Integer actualId = cat.getId();


        //Then
        Assert.assertEquals(expectedId,actualId);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void animalInstanceTest() {
        //Given
        Animal animal = new Animal() {
           // public void testDogIsAnimal() {
                String expectedName = "Kitty";
                Date expectedDob = new Date(2010, Calendar.MAY, 10);
                int expectedId = 111;
                Animal cat = new Cat(expectedName, expectedDob, expectedId) {
                };

            @Override
            public String speak() {
                return "";
            }

            @Override
            public Integer getNumberOfMealsEaten() {
                return 0;
            }

            @Override
            public Integer getId() {
                return 0;
            }

            @Override
            public void eat(Food food) {

            }

        };

    }
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

}
