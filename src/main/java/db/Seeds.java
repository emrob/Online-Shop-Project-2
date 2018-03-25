package db;

import models.BeautyProduct;
import models.BeautyUse;
import models.Brand;

public class Seeds {

    public static void seedData() {

        DBHelper.deleteAll(BeautyProduct.class);
        DBHelper.deleteAll(Brand.class);

        Brand brand1 = new Brand("Inika");
        DBHelper.save(brand1);
        Brand brand2 = new Brand("Eden");
        DBHelper.save(brand2);
        BeautyProduct beautyProduct1 = new BeautyProduct("Mascara", 100, 5.99, BeautyUse.MakeUp, brand1);
        DBHelper.save(beautyProduct1);
        BeautyProduct beautyProduct2 = new BeautyProduct("Perfume", 200, 45.99, BeautyUse.Fragrance, brand2);
        DBHelper.save(beautyProduct2);
        BeautyProduct beautyProduct3 = new BeautyProduct("Foundation", 75, 30.00, BeautyUse.MakeUp, brand1);
        DBHelper.save(beautyProduct3);

    }

}





