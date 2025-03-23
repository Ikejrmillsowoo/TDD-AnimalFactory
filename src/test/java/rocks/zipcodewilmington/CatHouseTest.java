package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    public CatHouse catHouse;

    @Test
    public void addCatsTest() {

        String expectedName = "Mad cat";
        Date expectedDob = new Date(2010, 10, 10);
        Integer expectedId = 10;
        Cat cat = new Cat(expectedName, expectedDob, expectedId);

        this.catHouse.add(cat);
        //Given
        Integer expectedNumberOfCats = this.catHouse.getNumberOfCats();


        //When
        Integer actualNumberOfCats = this.catHouse.getNumberOfCats();
        //Integer expectedId = CatHouse.getCatById(10);

        //Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);

    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatsTest() {
        String expectedName = "Mad cat";
        Date expectedDob = new Date(2010, 10, 10);
        Integer expectedId = 10;
        Cat cat = new Cat(expectedName, expectedDob, expectedId);

        this.catHouse.add(cat);
        this.catHouse.add(cat);
        this.catHouse.add(cat);
        this.catHouse.add(cat);
        //Given
        this.catHouse.remove(expectedId);
        this.catHouse.remove(expectedId);
        Integer expectedNumberOfCats = this.catHouse.getNumberOfCats();


        //When
        Integer actualNumberOfCats = this.catHouse.getNumberOfCats();
        //Integer expectedId = CatHouse.getCatById(10);

        //Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);

    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatsTest1() {
        String expectedName = "Mad cat";
        Date expectedDob = new Date(2010, 10, 10);
        Integer expectedId = 10;
        Cat cat = new Cat(expectedName, expectedDob, expectedId);

        this.catHouse.add(cat);
        this.catHouse.add(cat);
        this.catHouse.add(cat);
        this.catHouse.add(cat);
        //Given
        this.catHouse.remove(cat);
        this.catHouse.remove(cat);
        Integer expectedNumberOfCats = this.catHouse.getNumberOfCats();


        //When
        Integer actualNumberOfCats = this.catHouse.getNumberOfCats();
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

        this.catHouse.add(cat);
        //Given
        Integer expectedNumberOfCats = this.catHouse.getCatById(10).getId();
        Assert.assertEquals(expectedId, expectedNumberOfCats);


    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        this.catHouse.clear();
        String expectedName = "Mad cat";
        Date expectedDob = new Date(2010, 10, 10);
        Integer expectedId = 10;
        Cat cat = new Cat(expectedName, expectedDob, expectedId);
        Cat cat1 = new Cat(expectedName, expectedDob, expectedId);
        //CatHouse catHouse = new CatHouse();
//        this.catHouse.clear();
        this.catHouse.add(cat);
        this.catHouse.add(cat1);
        //Given
//        Integer expectedNumberOfCats = 2;
        Integer expected = 2;
        Integer actualNumberOfCats = this.catHouse.getNumberOfCats();


        Assert.assertTrue(actualNumberOfCats ==2);
    }


}
