package models;

public class BeautyProduct extends Stock {

    private BeautyUse beautyUse;

    public BeautyProduct(String name, int quantity, double price, BeautyUse beautyuse) {
        super(name, quantity, price);
        this.beautyUse = beautyuse;
    }

    public BeautyUse getBeautyUse() {
        return beautyUse;
    }

    public void setBeautyUse(BeautyUse beautyUse) {
        this.beautyUse = beautyUse;
    }
}
