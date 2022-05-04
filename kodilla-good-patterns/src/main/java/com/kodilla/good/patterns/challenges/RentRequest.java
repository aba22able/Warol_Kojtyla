package com.kodilla.good.patterns.challenges;

public class RentRequest
{
    private final User user;
    private final String from;
    private final String getTo;

    public RentRequest(User user, String from, String getTo) {
        this.user = user;
        this.from = from;
        this.getTo = getTo;
    }

    public User getUser() {
        return user;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return getTo;
    }

}
