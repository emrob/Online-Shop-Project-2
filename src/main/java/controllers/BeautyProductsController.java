package controllers;

import db.DBHelper;
import db.Seeds;
import models.BeautyProduct;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;


public class BeautyProductsController {
    public BeautyProductsController() {
        this.setUpEndpoints();
    }

    private void setUpEndpoints() {
        get("/beautyproducts", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<BeautyProduct> beautyProducts = DBHelper.getAll(BeautyProduct.class);
            model.put("beautyProducts", beautyProducts);
            model.put("template", "templates/beautyproducts/index.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());
    }

}

