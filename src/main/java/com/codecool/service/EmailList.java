package com.codecool.service;

import com.codecool.model.User;

import java.util.ArrayList;
import java.util.List;

public class EmailList {
    private static EmailList ourInstance = new EmailList();
    private List<User> users;
    
    public List<User> getUsers() {
        return users;
    }
    
    public static EmailList getInstance() {
        return ourInstance;
    }
    
    private EmailList() {
        users = new ArrayList<>();
    }
    
    public void addUsers(User user) {
        users.add(user);
    }
}
