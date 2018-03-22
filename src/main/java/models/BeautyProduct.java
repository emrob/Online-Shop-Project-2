package models;

public class BeautyProduct extends Stock {

    private BeautyUse beautyUse;

    public BeautyProduct(int quantity, int price) {
        super(quantity, price);
    }

    public BeautyUse getBeautyUse() {
        return beautyUse;
    }

    public void setBeautyUse(BeautyUse beautyUse) {
        this.beautyUse = beautyUse;
    }
}
