package controllers;

import db.Seeds;

import static spark.SparkBase.staticFileLocation;

public class MainController {
    public static void main(String[] args) {

        Seeds.seedData();

        staticFileLocation("/public");
    }
}
