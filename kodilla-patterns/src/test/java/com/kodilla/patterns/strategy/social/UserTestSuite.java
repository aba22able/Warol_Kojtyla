package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite
{
    @Test
    public void testDefaultSharingStrategies()
    {
        //Given
        User youngUser = new Millenials("Andzela");
        User regularUser = new YGeneration("Seba");
        User oldUser = new ZGeneration("Andrzej");

        //When
        String media1 = youngUser.sharePost();
        System.out.println("Hi! I am " + youngUser.getName() + " and I am using " + media1);
        String media2 = regularUser.sharePost();
        System.out.println("Hi! I am " + regularUser.getName() + " and I am using " + media2);
        String media3 = oldUser.sharePost();
        System.out.println("Hi! I am " + oldUser.getName() + " and I am using " + media3);

        //Then
        assertEquals("Snapchat", media1);
        assertEquals("Facebook", media2);
        assertEquals("Twitter", media3);
    }

    @Test
    public void testIndividualSharingStrategy()
    {
        //Given
        User user1 = new Millenials("Andzela");

        //When
        String media = user1.socialPublisher.share();
        System.out.println("Hi! I am " + user1.getName() + " and I am using " + media);

        user1.setSocialMedia(new FacebookPublisher());
        media = user1.socialPublisher.share();
        System.out.println("Hi! I am " + user1.getName() + " and now I switched to " + media);

        //Then
        assertEquals("Facebook", media);
    }
}
