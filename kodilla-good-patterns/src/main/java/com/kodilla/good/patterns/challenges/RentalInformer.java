package com.kodilla.good.patterns.challenges;

import java.sql.SQLOutput;

public class RentalInformer implements InformationService
{

    @Override
    public void inform(User user) {
        System.out.println(System.lineSeparator() + "Dear " + user.getUserName() + " " + user.getUserLastName() + " your order is confirmed. Kind regards.");
    }
}
