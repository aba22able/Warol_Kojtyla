package com.kodilla.good.patterns.challenges;

public class User
{
    private String userName;
    private String userLastName;
    private String userNickName;

    public User(String userName, String userLastName, String userNickName) {
        this.userName = userName;
        this.userLastName = userLastName;
        this.userNickName = userNickName;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserNickName() {
        return userNickName;
    }
}
