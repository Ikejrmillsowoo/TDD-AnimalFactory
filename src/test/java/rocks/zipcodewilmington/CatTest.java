package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`

    @Test
    public void setNameTest(){
        //Given
        Cat cat = new Cat("meower",  new Date("December 17, 1995"), 1);
        Cat cat2 = new Cat("jimmy", new Date("March 18, 2001"), 2);

        //When
        cat.setName("eddie");
        cat2.setName("micky");

        //Then
        Assert.assertEquals("eddie", cat.getName());
        Assert.assertEquals("micky", cat2.getName());
    }
    // TODO - Create tests for `speak`

    @Test
    public void setBirthDateTest(){
       //Given
        Cat cat = new Cat("meower",  new Date("December 17, 1995"), 1);
        Cat cat2 = new Cat("meower",  new Date("March 18, 2001"), 1);

        //When
        cat.setBirthDate(new Date("December 17, 1995"));
        cat2.setBirthDate(new Date("March 18, 2001"));

        //Then
        Assert.assertEquals(new Date("December 17, 1995"), cat.getBirthDate());
        Assert.assertEquals(new Date("March 18, 2001"), cat2.getBirthDate());


    }
    //Given

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

}
