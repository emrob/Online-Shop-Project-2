package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="brands")
public class Brand {

    private int id;
    private String name;
    private Set<BeautyProduct> products;

    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "brand")
    public Set<BeautyProduct> getProducts() {
        return products;
    }

    public void setProducts(Set<BeautyProduct> products) {
        this.products = products;
    }
}
