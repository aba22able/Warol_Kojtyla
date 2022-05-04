package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        MovieStore store = new MovieStore();

        store.moviesReader();

        ProductOrderService service = new ProductOrderService(new RentalInformer(), new OrderCreation(), new Repository());

        Repository repository = new Repository();

        RentRequest request1 = repository.createOrder();

        service.process(request1);
    }
}
