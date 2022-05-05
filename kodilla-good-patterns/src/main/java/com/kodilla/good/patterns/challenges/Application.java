package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.food2door.*;

public class Application {
    public static void main(String[] args) {
        MovieStore store = new MovieStore();
        store.moviesReader();

        ProductOrderService service = new ProductOrderService(new RentalInformer(), new OrderCreation(), new Repository());
        Repository repository = new Repository();

        RentRequest request1 = repository.createOrder();
        service.process(request1);

        ProductOrderProcessor processor = new ProductOrderProcessor();
        boolean test1 = processor.productsAdder(new GoodFood());
        GoodFood goodFood = new GoodFood();
        goodFood.process(test1);
    }
}
