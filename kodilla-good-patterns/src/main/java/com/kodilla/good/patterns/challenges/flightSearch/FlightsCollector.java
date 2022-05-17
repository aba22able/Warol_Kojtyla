package com.kodilla.good.patterns.challenges.flightSearch;

import java.util.*;

public class FlightsCollector
{
    final String city1 = "Wadowice";
    final String city2 = "Watykan";
    final String city3 = "Koluszki";
    final String city4 = "Puerto Rico";

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FlightsCollector that = (FlightsCollector) o;
        return city1.equals(that.city1) && city2.equals(that.city2) && city3.equals(that.city3) && city4.equals(that.city4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city1, city2, city3, city4);
    }

    public Map<String, List<String>> flightsMap()
    {
        final String destination1 = "Watykan";
        final String destination2 = "Koluszki";
        final String destination3 = "Wadowice";
        final String destination4 = "Puerto Rico";

        List<String> list1 = new ArrayList<>();
        list1.add(destination1);
        list1.add(destination2);

        List<String> list2 = new ArrayList<>();
        list2.add(destination3);
        list2.add(destination4);

        List<String> list3 = new ArrayList<>();
        list3.add(destination4);
        list3.add(destination1);

        List<String> list4 = new ArrayList<>();
        list4.add(destination3);
        list4.add(destination1);

        Map<String, List<String>> flights = new HashMap<>();

        flights.put(city1, list1);
        flights.put(city2, list2);
        flights.put(city3, list3);
        flights.put(city4, list4);

        return new HashMap<>(flights);
    }
}
