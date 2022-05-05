package com.kodilla.good.patterns.challenges.food2door;

public class DobraKaloria implements ProductsService
{
    private final String productName = "Batonik3";
    private final int quantity = 100;

    @Override
    public void process(boolean isAdded) {

        if(isAdded)
        {
            System.out.println("Product " + productName + " added! Success!");
        } else {
            System.out.println("Adding failed!");
        }
    }
}
