package models;

import javax.persistence.*;

@Entity
@Table(name="beauty_product")
public class BeautyProduct extends Stock {

    private BeautyUse beautyUse;
    private Brand brand;

    public BeautyProduct(String name, int quantity, double price, BeautyUse beautyuse, Brand brand) {
        super(name, quantity, price);
        this.beautyUse = beautyuse;
        this.brand = brand;

    }

    @Column(name="beauty_use")
    public BeautyUse getBeautyUse() {
        return beautyUse;
    }

    public void setBeautyUse(BeautyUse beautyUse) {
        this.beautyUse = beautyUse;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id", nullable = false)
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

}
