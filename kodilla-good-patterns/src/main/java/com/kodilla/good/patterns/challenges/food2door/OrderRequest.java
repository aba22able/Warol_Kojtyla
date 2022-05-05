package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest
{
    private final Product product;
    private final int quantity;

    public OrderRequest(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
