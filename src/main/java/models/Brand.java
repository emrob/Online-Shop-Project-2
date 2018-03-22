package models;

import java.util.Set;

public class Brand {

    private int id;
    private String name;
    private Set<BeautyProduct> products;

    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BeautyProduct> getProducts() {
        return products;
    }

    public void setProducts(Set<BeautyProduct> products) {
        this.products = products;
    }
}
