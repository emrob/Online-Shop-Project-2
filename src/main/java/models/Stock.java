package models;

public abstract class Stock {

    private int id;
    private int quantity;
    private int price;

    public Stock(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String checkAvailability(){
        if (quantity > 0)
            return "In stock";
            else
                return "Currently out of stock";
        }
    }


