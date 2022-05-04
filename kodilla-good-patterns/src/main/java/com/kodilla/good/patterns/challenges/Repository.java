package com.kodilla.good.patterns.challenges;

public class Repository implements OrderRepository
{

    @Override
    public RentRequest createOrder() {
        User user1 = new User("Warol", "Kojtyła", "Babież");

        String origin = "Warszawa";
        String destiny = "Wrocław";

        return new RentRequest(user1, origin, destiny);
    }
}
