package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto
{
    private final Product product;
    private final int quantity;
    private boolean isOrdered;

    public OrderDto(Product product, int quantity, boolean isOrdered) {
        this.product = product;
        this.quantity = quantity;
        this.isOrdered = isOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
