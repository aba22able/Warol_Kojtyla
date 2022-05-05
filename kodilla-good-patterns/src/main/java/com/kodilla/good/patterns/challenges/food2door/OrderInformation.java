package com.kodilla.good.patterns.challenges.food2door;

public class OrderInformation implements InformationService
{

    @Override
    public void orderMessage(Product product, int quantity, boolean ordered) {
        if(ordered){
            System.out.println("The product:" + product.getNameOfProduct() + " ("
                    + product.getCompany() + ") order completed! Quantity-" + quantity);
        } else {
            System.out.println("The product:" + product.getNameOfProduct() + " ("
                    + product.getCompany() + ") ORDER FAILED!!!");
        }
    }
}
