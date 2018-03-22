import db.DBHelper;
import models.BeautyProduct;
import models.BeautyUse;
import models.Brand;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
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


        List<BeautyProduct> allBeautyProducts = DBHelper.getAll(BeautyProduct.class);

        List<BeautyProduct> results = DBHelper.getProductsByBrand(brand1);



    }
}
