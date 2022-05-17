package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.flightSearch.FlightSearch;
import com.kodilla.good.patterns.challenges.flightSearch.FlightsCollector;
import com.kodilla.good.patterns.challenges.food2door.*;

import java.util.List;
import java.util.Map;

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

        FlightsCollector flightsCollector = new FlightsCollector();
        Map<String, List<String>> map = flightsCollector.flightsMap();
        FlightSearch flightSearch = new FlightSearch("Wadowice");
        flightSearch.flightsFrom(map);
        flightSearch.flightsTo(map);
        flightSearch.flightsVia(map);
    }
}
