package com.kodilla.good.patterns.challenges.food2door;

public class Product
{
    private final String company;
    private final String nameOfProduct;

    public Product(String company, String nameOfProduct) {
        this.company = company;
        this.nameOfProduct = nameOfProduct;
    }

    public String getCompany() {
        return company;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }
}
