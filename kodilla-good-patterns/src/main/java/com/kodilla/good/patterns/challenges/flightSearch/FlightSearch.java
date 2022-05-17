package com.kodilla.good.patterns.challenges.flightSearch;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearch
{
    private final String city;

    public FlightSearch(String city)
    {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    FlightsCollector flightsCollector = new FlightsCollector();

    public void flightsFrom(Map<String, List<String>> map) {
        System.out.println("Flights from " + getCity() + ":");

        flightsCollector.flightsMap().entrySet().stream()
                .filter(f -> getCity().equals(f.getKey()))
                .flatMap(e -> e.getValue().stream())
                .forEach(System.out::println);
    }

    public void flightsTo(Map<String, List<String>> map) {
        System.out.println("Flights to " + getCity() + " are from:");

        flightsCollector.flightsMap().entrySet().stream()
                .flatMap(e -> e.getValue().stream()
                        .map(v->new AbstractMap.SimpleImmutableEntry<>(e.getKey(), v)))
                .filter(f -> getCity().equals(f.getValue()))
                .forEach(t ->System.out.println(t.getKey()));
    }

    public void flightsVia(Map<String, List<String>> map) {
        System.out.println("Transit flights to " + getCity() + " are from:");

        final List<String> newList = flightsCollector.flightsMap().entrySet().stream()
                .flatMap(e -> e.getValue().stream()
                        .map(v->new AbstractMap.SimpleImmutableEntry<>(e.getKey(), v)))
                .filter(f -> getCity().equals(f.getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        flightsCollector.flightsMap().entrySet().stream()
                .flatMap(o -> o.getValue().stream()
                        .map(l->new AbstractMap.SimpleImmutableEntry<>(o.getKey(), l)))
                .filter(r -> !r.getKey().equals(getCity()))
                .filter(e -> newList.contains(e.getValue()))
                .forEach(c -> System.out.println(c.getKey() + " via- " + c.getValue()));
    }
}
