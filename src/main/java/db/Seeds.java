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
        BeautyProduct beautyProduct1 = new BeautyProduct("Mascara", 100, 5.99, BeautyUse.MakeUp, brand1);
        DBHelper.save(beautyProduct1);

    }

}
