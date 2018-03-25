package controllers;

import db.DBHelper;
import models.BeautyProduct;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;

public class BeautyProductsController {
    public BeautyProductsController() {
        this.setUpEndpoints()
    }

    private void setUpEndpoints() {
        get("/beautyproducts", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<BeautyProduct> beautyproduct = DBHelper.getAll(BeautyProduct.class);
            model.put("beautyproduct", beautyproduct);
            model.put("template", "templates/index.vtl");

            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());
    }

}

