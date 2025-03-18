package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    public CatHouse catHouse;
    void setUp(){
        String expectedName = "Mad cat";
        Date expectedDob = new Date(2010, 10, 10);
        Integer expectedId = 10;
        Cat cat = new Cat(expectedName, expectedDob, expectedId);

  }

    @Test
    public void addCatsTest() {

        String expectedName = "Mad cat";
        Date expectedDob = new Date(2010, 10, 10);
        Integer expectedId = 10;
        Cat cat = new Cat(expectedName, expectedDob, expectedId);

        CatHouse.add(cat);
        //Given
        Integer expectedNumberOfCats = CatHouse.getNumberOfCats();


        //When
        Integer actualNumberOfCats = CatHouse.getNumberOfCats();
        //Integer expectedId = CatHouse.getCatById(10);

        //Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatsTest() {
        setUp();
        String expectedName = "Mad cat";
        Date expectedDob = new Date(2010, 10, 10);
        Integer expectedId = 10;
        Cat cat = new Cat(expectedName, expectedDob, expectedId);

        CatHouse.add(cat);
        CatHouse.add(cat);
        CatHouse.add(cat);
        CatHouse.add(cat);
        //Given
        CatHouse.remove(expectedId);
        CatHouse.remove(expectedId);
        Integer expectedNumberOfCats = CatHouse.getNumberOfCats();


        //When
        Integer actualNumberOfCats = CatHouse.getNumberOfCats();
        //Integer expectedId = CatHouse.getCatById(10);

        //Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);

    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatsTest1() {
        setUp();
        String expectedName = "Mad cat";
        Date expectedDob = new Date(2010, 10, 10);
        Integer expectedId = 10;
        Cat cat = new Cat(expectedName, expectedDob, expectedId);

        CatHouse.add(cat);
        CatHouse.add(cat);
        CatHouse.add(cat);
        CatHouse.add(cat);
        //Given
        CatHouse.remove(cat);
        CatHouse.remove(cat);
        Integer expectedNumberOfCats = CatHouse.getNumberOfCats();


        //When
        Integer actualNumberOfCats = CatHouse.getNumberOfCats();
        //Integer expectedId = CatHouse.getCatById(10);

        //Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);

    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        //setUp();
        String expectedName = "Mad cat";
        Date expectedDob = new Date(2010, 10, 10);
        Integer expectedId = 10;
        Cat cat = new Cat(expectedName, expectedDob, expectedId);

        CatHouse.add(cat);
        //Given
        Cat expectedNumberOfCats = CatHouse.getCatById(expectedId);
        Assert.assertEquals(cat, expectedNumberOfCats);


    }
    // TODO - Create tests for `Integer getNumberOfCats()`
   @Test
    public void getNumberOfCatsTest() {
        String expectedName = "Mad cat";
        Date expectedDob = new Date(2010, 10, 10);
        Integer expectedId = 10;
        Cat cat = new Cat(expectedName, expectedDob, expectedId);
        Cat cat1 = new Cat(expectedName, expectedDob, expectedId);

        CatHouse.add(cat);
        CatHouse.add(cat1);
        //Given
       Integer actualNumberOfCats = 2;
        Integer expectedNumberOfCats = CatHouse.getNumberOfCats();


        Assert.assertEquals(actualNumberOfCats, expectedNumberOfCats);
    }


}
