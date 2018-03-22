import db.DBHelper;
import models.BeautyProduct;
import models.BeautyUse;
import models.Brand;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestBeautyProduct {

    BeautyProduct beautyProduct;
    Brand brand;


    @Before
    public void before(){
        brand = new Brand("Inika");
        beautyProduct = new BeautyProduct("Mascara",100,5.99,BeautyUse.MakeUp, brand);

    }

    @Test
    public void canGetNameofProduct(){
        assertEquals("Mascara", beautyProduct.getName());
    }

    @Test
    public void canGetQuantity(){
        assertEquals(100, beautyProduct.getQuantity());
    }

    @Test
    public void canGetPrice(){
        assertEquals(5.99, beautyProduct.getPrice(),0.01);
    }

    @Test
    public void canCanUse(){
        assertEquals(BeautyUse.MakeUp, beautyProduct.getBeautyUse());
    }

    @Test
    public void canGetAvailability(){
        assertEquals("In stock", beautyProduct.checkAvailability());
    }

    @Test
    public void checkBrand(){
        assertEquals("Inika", beautyProduct.getBrand().getName());
    }
}

