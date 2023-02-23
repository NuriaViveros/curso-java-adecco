package com.nuriaviveros.exampleproduct;

public class Product {

    private String name;
    private String type;
    private Double price;
    private Double percDiscountOnSale;
    private Boolean onSale;
    private Boolean inStock;

    private Boolean presentInCart;

    private Manufacturer manufacturer;

    //Constructores
    public Product() {
    }

    public Product(String name, String type, Double price, Double percDiscountOnSale, Boolean onSale, Boolean inStock, Boolean presentInCart, Manufacturer manufacturer) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.percDiscountOnSale = percDiscountOnSale;
        this.onSale = onSale;
        this.inStock = inStock;
        this.presentInCart = presentInCart;
        this.manufacturer = manufacturer;
    }

    //Métodos Getter y Setter

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }

    public Double getPercDiscountOnSale() {
        return percDiscountOnSale;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public Boolean getPresentInCart() {
        return presentInCart;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setPercDiscountOnSale(Double percDiscountOnSale) {
        this.percDiscountOnSale = percDiscountOnSale;
    }

    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public void setPresentInCart(Boolean presentInCart) {
        this.presentInCart = presentInCart;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", percDiscountOnSale=" + percDiscountOnSale +
                ", onSale=" + onSale +
                ", inStock=" + inStock +
                ", presentInCart=" + presentInCart +
                ", manufacturer=" + manufacturer.toString() +
                '}';
    }
}
